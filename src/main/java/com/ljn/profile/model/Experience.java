package com.ljn.profile.model;

import com.sun.istack.internal.NotNull;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

@Table("experience")
public class Experience {
    /**
     * 未知
     */
    public static int TYPE_UNDEFINED = 0;

    /**
     * 教育经历
     */
    public static int TYPE_EDU = 1;

    /**
     * 获奖经历
     */
    public static int TYPE_REWARD = 2;

    /**
     * 工作经历
     */
    public static int TYPE_WORK = 3;

    @Id(auto = true)
    @Column(value = "id")
    private int mExperienceId;

    @Column(value = "user_id")
    private int userId;

    @Column(value = "type")
    private int type = TYPE_UNDEFINED;

    @NotNull
    @Column(value = "content")
    private String content = "";

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @NotNull
    public String getContent() {
        return content;
    }

    public void setContent(@NotNull String content) {
        this.content = content;
    }

    public int getExperienceId() {
        return mExperienceId;
    }

    public void setExperienceId(int experienceId) {
        mExperienceId = experienceId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
