package cn.yingchuang.service;

import cn.yingchuang.entity.CompanyInformation;
import com.github.pagehelper.PageInfo;

/**
 * Created by 朱博文 on 2018/3/19.
 */
public interface CompanyInformationService {
    public PageInfo<CompanyInformation> queryAllCompanyInformation(Integer pageNum,Integer pageSiz);
}
