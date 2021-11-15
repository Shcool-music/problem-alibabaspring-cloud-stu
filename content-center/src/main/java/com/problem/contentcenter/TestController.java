package com.problem.contentcenter;

import com.alibaba.cloud.nacos.discovery.NacosDiscoveryClient;
import com.problem.contentcenter.domain.entity.Share;
import com.problem.contentcenter.mapper.ShareMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

	private final ShareMapper shareMapper;

	@Autowired
	private DiscoveryClient discoveryClient;

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

	/**
	 * 测试服务发现
	 */
	@GetMapping("/test1")
	public List<ServiceInstance> nacosDiscoveryClient() {
		return discoveryClient.getInstances("user-center");
	}
}
