package com.demo.idap.entity;

//存放所有云数据的表CLOUDATA3对应的实体类
public class CloudAllData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_IADP_CLOUDATA3.CLOUDCODE
     *
     * @mbggenerated
     */
    private Integer cloudcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_IADP_CLOUDATA3.YEAR
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_IADP_CLOUDATA3.DATA
     *
     * @mbggenerated
     */
    private Long data;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_IADP_CLOUDATA3.INDEXCODE
     *
     * @mbggenerated
     */
    private String indexcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_IADP_CLOUDATA3.CLOUDCODE
     *
     * @return the value of TB_IADP_CLOUDATA3.CLOUDCODE
     *
     * @mbggenerated
     */
    public Integer getCloudcode() {
        return cloudcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_IADP_CLOUDATA3.CLOUDCODE
     *
     * @param cloudcode the value for TB_IADP_CLOUDATA3.CLOUDCODE
     *
     * @mbggenerated
     */
    public void setCloudcode(Integer cloudcode) {
        this.cloudcode = cloudcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_IADP_CLOUDATA3.YEAR
     *
     * @return the value of TB_IADP_CLOUDATA3.YEAR
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_IADP_CLOUDATA3.YEAR
     *
     * @param year the value for TB_IADP_CLOUDATA3.YEAR
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_IADP_CLOUDATA3.DATA
     *
     * @return the value of TB_IADP_CLOUDATA3.DATA
     *
     * @mbggenerated
     */
    public Long getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_IADP_CLOUDATA3.DATA
     *
     * @param data the value for TB_IADP_CLOUDATA3.DATA
     *
     * @mbggenerated
     */
    public void setData(Long data) {
        this.data = data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_IADP_CLOUDATA3.INDEXCODE
     *
     * @return the value of TB_IADP_CLOUDATA3.INDEXCODE
     *
     * @mbggenerated
     */
    public String getIndexcode() {
        return indexcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_IADP_CLOUDATA3.INDEXCODE
     *
     * @param indexcode the value for TB_IADP_CLOUDATA3.INDEXCODE
     *
     * @mbggenerated
     */
    public void setIndexcode(String indexcode) {
        this.indexcode = indexcode == null ? null : indexcode.trim();
    }
}