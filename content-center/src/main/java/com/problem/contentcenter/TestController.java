package com.problem.contentcenter;

import com.problem.contentcenter.domain.entity.Share;
import com.problem.contentcenter.mapper.ShareMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

	private final ShareMapper shareMapper;

	@GetMapping("/test")
	public Share insertShare() {
		Share share = new Share();
		share.setUserId(1);
		share.setTitle("xxxx");
		share.setUpdateTime(new Date());
		share.setCreateTime(new Date());
		shareMapper.insert(share);
		return share;
	}
}
