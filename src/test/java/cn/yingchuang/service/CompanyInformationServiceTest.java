package cn.yingchuang.service;

import cn.yingchuang.entity.CompanyInformation;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 朱博文 on 2018/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CompanyInformationServiceTest {
    @Resource
    private CompanyInformationService companyInformationService;
    @Test
    public void queryAllCompanyInformation() throws Exception {
        PageInfo<CompanyInformation> pageInfo=companyInformationService.queryAllCompanyInformation(1,2);
        if(pageInfo!=null){
            System.out.println("总行数"+pageInfo);
            List<CompanyInformation> list=pageInfo.getList();
            if(list!=null){
                for (CompanyInformation companyInformation:list){
                    System.out.println(companyInformation);
                }
            }
        }

    }

}