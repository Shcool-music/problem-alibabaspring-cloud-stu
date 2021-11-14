package com.problem.contentcenter.service.content;

import com.problem.contentcenter.domain.dto.content.ShareDTO;
import com.problem.contentcenter.domain.dto.user.UserDTO;
import com.problem.contentcenter.domain.entity.Share;
import com.problem.contentcenter.mapper.ShareMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareService {

	private final ShareMapper shareMapper;

	private final RestTemplate restTemplate;

	public ShareDTO findById(Integer id) {
		//获取分享详情
		Share share = shareMapper.selectById(id);
		//发布人id
		Integer userId = share.getUserId();
		ResponseEntity<UserDTO> userDTOResponseEntity =
				restTemplate.getForEntity("http://localhost:8080/users/1", UserDTO.class);

		ShareDTO shareDTO = new ShareDTO();
		BeanUtils.copyProperties(share, shareDTO);
		shareDTO.setWxNickName(Objects.requireNonNull(userDTOResponseEntity.getBody()).getWxNickname());
		return shareDTO;
	}

}
