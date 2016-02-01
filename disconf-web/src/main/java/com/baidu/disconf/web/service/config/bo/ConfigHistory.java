package com.baidu.disconf.web.service.config.bo;

import com.baidu.dsp.common.dao.Columns;
import com.baidu.dsp.common.dao.DB;
import com.baidu.unbiz.common.genericdao.annotation.Column;
import com.baidu.unbiz.common.genericdao.annotation.Table;
import com.github.knightliao.apollo.db.bo.BaseObject;

import lombok.Data;

@Data
@Table(db = DB.DB_NAME, name = "config_history", keyColumn = Columns.ID)
public class ConfigHistory extends BaseObject<Long> {

    /**
     *
     */
    @Column(value = Columns.CONFIG_ID)
    private Long configId;

    /**
     *
     */
    @Column(value = Columns.OLD_VALUE)
    private String oldValue;

    /**
     *
     */
    @Column(value = Columns.NEW_VALUE)
    private String newValue;

    /**
     * 创建时间
     */
    @Column(value = Columns.CREATE_TIME)
    private String createTime;

}
