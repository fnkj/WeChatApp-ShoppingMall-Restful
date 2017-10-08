package com.leewaiho.togogo.common.base.controller;

import com.leewaiho.togogo.common.base.model.BaseModel;
import com.leewaiho.togogo.common.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.leewaiho.togogo.common.Const.BASE_PATH;

/**
 * Author leewaiho
 * Email 791783391@qq.com
 * Date 2017/10/8
 * Project togogo-shixun
 */
@RestController
@RequestMapping(BASE_PATH + "/meta")
public class MetaDataController {
    @RequestMapping(method = RequestMethod.GET, value = "/status")
    public Result getStatusInfo() {
        Map map = new HashMap<>();
        for (BaseModel.Status status : BaseModel.Status.values()) {
            map.put(status.getName(), status.getValue());
        }
        return Result.success(map);
    }
}
