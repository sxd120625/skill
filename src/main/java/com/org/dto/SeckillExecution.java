package com.org.dto;

import com.org.entity.Successkilled;
import com.org.enums.SeckillStateEnum;

/**
 * 封装秒杀执行后的结果
 * Created by Administrator on 2016/8/25.
 */
public class SeckillExecution {
    private  long seckillId;
    //秒杀执行结果状态
    private int state;
    //状态标示
    private String  stateInfo;
    //秒杀成功对象
    private Successkilled successkilled;

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successkilled=" + successkilled +
                '}';
    }

    public SeckillExecution(long seckillId, SeckillStateEnum stateEnum, Successkilled successkilled) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.successkilled = successkilled;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum stateEnum) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Successkilled getSuccesskilled() {
        return successkilled;
    }

    public void setSuccesskilled(Successkilled successkilled) {
        this.successkilled = successkilled;
    }
}
