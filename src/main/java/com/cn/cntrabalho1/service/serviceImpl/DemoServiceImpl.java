package com.cn.cntrabalho1.service.serviceImpl;

import com.cn.cntrabalho1.repository.DemoRepository;
import com.cn.cntrabalho1.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    private final DemoRepository demoRepository;

    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public String helloWorld() {
        return "Hello World!";
    }
}
