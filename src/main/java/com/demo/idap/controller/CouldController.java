package com.demo.idap.controller;
import com.demo.idap.entity.CloudAllData;
import com.demo.idap.entity.CloudData;
import com.demo.idap.entity.Cloudsort;

import com.demo.idap.service.GetCloudDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@Controller
@RequestMapping(value = {"/cloud"})
public class CouldController {
        public GetCloudDataService getGetCloudDataService() {
                return getCloudDataService;
        }

        /**
         * 注入service
         */
        @Autowired
        private GetCloudDataService getCloudDataService;


        //根据level查询出每个云
        @RequestMapping(value = {"/getcloud"})
        @ResponseBody
        public List<Cloudsort> getCloud() throws IOException {

                List<Cloudsort> cloudsorts = getCloudDataService.getCloudSort(1);
                return cloudsorts;
                //keymap集合取数
//                Map<String,String> map = (Map<String, String>) getCloudDataService.getCloudSort((long) 10);
//                Set<Map.Entry<String,String>> entrySet = map.entrySet();
//                Iterator<Map.Entry<String,String>> it = entrySet.iterator();
//                while(it.hasNext())
//                {
//                        Map.Entry<String,String> me = it.next();
//                        String key = me.getKey();
//                        String value = me.getValue();
//                        System.out.println("key="+key+",value="+value);
//                }
        }

        //用List<Map<>>的形式取出指标+中文与单位名
        @RequestMapping(value = {"/getcloudata"})
        @ResponseBody
        public List<Map<String, String>> getIndexChinese() throws IOException {

                List<Map<String, String>> cloudresult = new ArrayList<Map<String, String>>();
                Map<String, String> map = null;
                List<CloudData> cloudindexChinese = getCloudDataService.getIndexChinese(10);
                for (CloudData item : cloudindexChinese) {
                        map = new HashMap<String, String>();
                        map.put("key", item.getIndexcode());
                        map.put("value", item.getChinesename() + "/" + item.getUnit());
                        System.out.println(map);
                        cloudresult.add(map);
                }
                return cloudresult;

        }

        //用List<Map<>>的形式取出指标+中文与单位名
        @RequestMapping(value = {"/getcloudalldata"})
        @ResponseBody
        public List<Map<String, Object>> getIndexData() throws IOException {

                List<Map<String, Object>> cloudresult = new ArrayList<Map<String, Object>>();
                Map<String, Object> map = null;
                List<CloudAllData> cloudindexData = getCloudDataService.getIndexData(10);
                for (CloudAllData item : cloudindexData) {
                        map = new HashMap<String, Object>();
                        map.put("key", item.getIndexcode());
                        map.put("value", item.getData());
                        System.out.println(map);
                        cloudresult.add(map);
                }
                return cloudresult;

        }

        @RequestMapping(value = {"/getresult"})
        @ResponseBody
        //取出中文/单位+数据
        public List<Map<String, Object>> getResult() throws IOException {

                List<Map<String, String>> cloudresult1 = new ArrayList<Map<String, String>>();
                Map<String, String> map1 = null;
                List<CloudData> cloudindexChinese = getCloudDataService.getIndexChinese(30);
                for (CloudData item1 : cloudindexChinese) {
                        map1 = new HashMap<String, String>();
                        map1.put(item1.getIndexcode(),item1.getChinesename() + "/" + item1.getUnit());
                        System.out.println(map1);
                        cloudresult1.add(map1);
                }

                List<Map<String, Object>> cloudresult2 = new ArrayList<Map<String, Object>>();
                Map<String, Object> map2 = null;
                List<CloudAllData> cloudindexData = getCloudDataService.getIndexData(30);
                for (CloudAllData item2 : cloudindexData) {
                        map2 = new HashMap<String, Object>();
                        map2.put(item2.getIndexcode(),item2.getData());
                        //map2.put("value", item2.getData());
                        System.out.println(map2);
                        cloudresult2.add(map2);
                }
                List<Map<String, Object>> cloudresult3 = new ArrayList<Map<String, Object>>();
                for(Map<String,String> s1:cloudresult1){

                        for(Map<String,Object> s2:cloudresult2) {

                                Iterator<String> iter1 = s1.keySet().iterator();

                                Iterator<String> iter2 = s2.keySet().iterator();
                                if (iter1.hasNext()) {
                                        String m1Key = (String) iter1.next();
                                        if(iter2.hasNext()){
                                                String m2Key = (String) iter2.next();
                                                if(m1Key.equals(m2Key)){
                                                        Map<String,Object> map=new HashMap<>();
                                                        map.put(s1.get(m1Key),s2.get(m2Key));
                                                        cloudresult3.add(map);
                                                }
                                        }
                                }
                                }

                        }
                return cloudresult3;
        }
        //查询三年（2016、2017、2018）的用户量数据
        @RequestMapping(value = {"/getyeardata"})
        @ResponseBody
        public List<CloudAllData> getYearsData() throws IOException {

                List<CloudAllData> yeardata = getCloudDataService.getYearsData();
                return yeardata;
        }

}


