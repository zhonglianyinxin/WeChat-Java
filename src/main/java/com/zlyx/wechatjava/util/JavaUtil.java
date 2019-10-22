package com.zlyx.wechatjava.util;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.StringUtils;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 1、两数计算结果四舍五入（例为除）:getNumTwo
 * 2、过滤特殊字符：StringFilter
 * 3、得到GBK编码：toGBK
 * 4、创建文件路径，已存在返回true：createDirectory
 * 5、数字转换成大写：digitUppercase
 * 6、字符串转换成日期：transferString
 * 7、日期转换成字符串：DateToString
 * 8、计算两个日期相隔的天数：computeDays
 * 9、用于判断是数字，还是汉字或者名称：isInt
 * 10、根据根据日期算出，该月的总天数：getDayByDate
 * 11、根据一个日期，修改已有的日期链;setPayDate
 * 12、根据文件夹路径获取文件内文件结合；FileList
 * 13、复制文件；copyfile
 * 14、返回指定编码格式的输入流：inputReaderIo
 * 15、返回指定编码格式的输出流：outputWriterIo
 * 16、获取系统日期的前count天:  getBeforeDate
 * 17、封装request成map对象：getMap
 * 18、指定日期，加上相应的类型（年月日），返还新的日期
 * 19、金额进行格式化处理，去除财务记法及万元转换成元
 * 20、MD5生成
 * 21、得到所有区域的名称
 * 22、将时间转换为时间戳  
 * 23、将时间戳转换为时间
 * 注：后面为方法名
 */
public class JavaUtil {

    /**
     * 2、过滤特殊字符
     */
    public static String StringFilter(String str) throws Exception {
        String result = null;
        try {
            if (str != null) {
                String regEx = "[`~!@#$%^&*()+=|{}':;,\\[\\]<>/?！￥…（）—【】‘；：”“’。，、？]";// 清除掉所有特殊字符
                Pattern p = Pattern.compile(regEx);
                Matcher m = p.matcher(str);
                result = m.replaceAll("").trim();
            }
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "替换特殊字符失败，参数为：" + str, LogUtil.EMPTY, e);
        }
        return result;
    }

    /**
     * 6、字符串转换成日期
     */
    public static Date StringToDate(String date, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            return format.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 7、日期转换成字符串
     *
     * @param date    日期对象
     * @param pattern 转换成字符串格式 例如："yyyyMMdd"
     *                throws Exception
     */
//    public static String DateToString(Date date, String pattern) throws Exception {
//        try {
//            SimpleDateFormat format = new SimpleDateFormat(pattern);
//            return format.format(date);
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "日期转换成字符串失败", LogUtil.EMPTY, e);
//        }
//    }

    /**
     * 7.1、把当前的日期转换成指定字符串yyyyMMddHHmmss
     *
     * @return yyyyMMddHHmmss
     * throws Exception
     */
    public static String nowToString() throws Exception {


        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            return format.format(new Date());
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "日期转换成字符串失败", LogUtil.EMPTY, e);
            throw e;
        }
    }

    /**
     * 8、计算两个日期相隔的天数，不分顺序，
     */
//    public static int computeDays(Date date1, Date date2) throws Exception {
//        // 计算date1
//        String day1 = DateToString(date1, "yyyyMMddHHmmss"); // 把日期转换成这种格式的字符串。注：如果参数与传的是字符串无需转换
//        String day2 = DateToString(date2, "yyyyMMddHHmmss");
//        day1 = day1.trim();
//        day2 = day2.trim();
//        if ("".equals(day1) || "".equals(day2)) {
//            return -1;
//        }
//        if (day1.length() != 14 || day2.length() != 14) {
//            return -1;
//        }
//        int num = 0;
//        String y1 = day1.substring(0, 4); // 年
//        String m1 = day1.substring(4, 6); // 月
//        String d1 = day1.substring(6, 8); // 日
//        String h1 = day1.substring(8, 10); // 时
//        String me1 = day1.substring(10, 12); // 分
//        String s1 = day1.substring(12, 14); // 秒
//
//        String y2 = day2.substring(0, 4);
//        String m2 = day2.substring(4, 6);
//        String d2 = day2.substring(6, 8);
//        String h2 = day2.substring(8, 10); // 时
//        String me2 = day2.substring(10, 12); // 分
//        String s2 = day2.substring(12, 14); // 秒
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.set(Integer.parseInt(y1), Integer.parseInt(m1) - 1, Integer.parseInt(d1), Integer.parseInt(h1), Integer.parseInt(me1),
//                Integer.parseInt(s1));
//        c2.set(Integer.parseInt(y2), Integer.parseInt(m2) - 1, Integer.parseInt(d2), Integer.parseInt(h2), Integer.parseInt(me2),
//                Integer.parseInt(s2));
//        if (c1.after(c2)) {
//            for (; c2.before(c1); ) {
//                c2.add(Calendar.DATE, 1);
//                num++;
//            }
//        }
//        if(c1.before(c2)) {
//            for (; c1.before(c2); ) {
//                c1.add(Calendar.DATE, 1);
//                num++;
//            }
//        }
//        return num;
//    }

    /**
     * 9、用于判断是数字，还是汉字或者名称
     */
    public static boolean isInt(String parameter) {
        char[] c = parameter.toCharArray();
        for (char aC : c) {
            if (aC < '0' || aC > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * 10、根据根据日期算出，该月的总天数
     */
    @SuppressWarnings("deprecation")
    public int getDayByDate(Date dateTest) {
        int year = dateTest.getYear();
        int month = dateTest.getMonth() + 1;
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
        }
        return day;
    }

    /**
     * 11、根据一个日期，修改已有的日期链 例如原有日期：2012年5月1日，6月1日，7月1日。。。。，修改成5月10日、6月10日。。。。。。 注：一般用事物进行修改
     */
    @SuppressWarnings({"rawtypes", "unused", "null", "unchecked"})
    public void setPayDate(Date date) {
        Map outputMap = new HashMap();
        List<Map> payLines;
        try {
            int leaseTerm = 2; // 还款的周期，例如是两个月一次
            payLines = null; // 支付明细表,sql查询出，原来的支付表信息
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int index = 0;
            Date endDate = null;
            for (Map payLine : payLines) {
                calendar.setTime(date);
                int num = 0;
                if (payLine.get("PERIOD_NUM") != null) {
                    num = Integer.parseInt(payLine.get("PERIOD_NUM").toString());
                }
                if (index != 0) {
                    calendar.add(Calendar.MONTH, leaseTerm * (num - 1));
                }
                payLine.put("PAY_DATE", calendar.getTime());
//                endDate = calendar.getTime();
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getPostfix(String path) {
        if (path == null || "".equals(path.trim())) {
            return "";
        }
        if (path.contains(".")) {
            return path.substring(path.lastIndexOf(".") + 1, path.length());
        }
        return "";
    }

    /**
     * 12、根据文件夹路径获取文件内文件结合 参数说明：文件夹路径
     */
    public static File[] FileList(String filePath) {
        File foldFile = new File(filePath);
        File[] fileList = null;
        boolean fileExit = foldFile.exists();
        if (!fileExit || !foldFile.isDirectory() || !foldFile.canRead()) {
            try {
                foldFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            fileList = foldFile.listFiles();
        }
        return fileList;
    }

//    /**
//     * 13、复制文件，由一个文件复制到另外一个 文件中
//     *
//     * @param filePath：原文件路径
//     * @param copyPath：目标文件路径 throws Exception
//     */
//    public static void copyfile(String filePath, String copyPath) throws Exception {
//        BufferedInputStream bRead = null;
//        BufferedOutputStream bWrite = null;
//        try {
//            File sPath = new File(filePath);
//            File dPath = new File(copyPath);
//            bRead = new BufferedInputStream(new FileInputStream(sPath));
//            bWrite = new BufferedOutputStream(new FileOutputStream(dPath));
//            int index;
//            while ((index = bRead.read()) != -1) {
//                bWrite.write(index);
//            }
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "日期转换成字符串失败", LogUtil.EMPTY, e);
//        } finally {
//            close(bRead);
//            close(bWrite);
//        }
//    }

    /**
     * 14、返回指定编码格式的输入流
     *
     * @param file：需要读取的文件
     * @param encoding：编码格式
     * @return BufferedReader：文件的输入流
     * throws Exception
     */
    public BufferedReader inputReaderIo(File file, String encoding) throws Exception {
        BufferedReader fReader = null;
        try {
            if (file != null && encoding != null) {
                fReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
            }
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "以指定编码格式读取文件输入失败", LogUtil.EMPTY, e);
        }
        return fReader;
    }

    /**
     * 15、返回指定编码格式的输出流
     *
     * @param file：需要读取文件
     * @param encoding：编码格式
     * @return BufferedWriter：文件的输出流
     * throws Exception
     */
    public BufferedWriter outputWriterIo(File file, String encoding) throws Exception {
        BufferedWriter writer = null;
        try {
            if (file != null && encoding != null) {
                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), encoding));
            }
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "以指定编码格式读取文件输出失败", LogUtil.EMPTY, e);
        }
        return writer;
    }

    /**
     * 16、获取系统日期的前count天
     */
    public static String getBeforeDate(Date date, int count) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) - count);
        return df.format(c.getTime());
    }

    /**
     * 17、封装request成map对象 参数名作为key，参数值作为value
     */
    public static Map<String, Object> getMap(HttpServletRequest request) throws Exception {
        Map<String, Object> bm = new HashMap<>();
        try {
            Map<String, String[]> tmp = request.getParameterMap();
            if (tmp != null) {
                for (String key : tmp.keySet()) {
                    key = key.trim();
                    String[] values = tmp.get(key);
                    Object obj = values.length == 1 ? values[0].trim() : values;
                    bm.put(key, obj);
                }
            }
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "封装request成map对象失败", LogUtil.EMPTY, e);
        }
        return bm;
    }

//    /**
//     * data 数据 将格式为format1格式的字符串，转为format2格式。
//     *
//     * @param data    ：日期值
//     * @param format1 ：被转换格式
//     * @param format2 ：转换格式
//     *                throws Exception
//     */
//    public static String stringToDateString(String data, String format1, String format2) throws Exception {
//        String dateResult;
//        try {
//            if (data == null || "".equals(data)) { // 如果日期为空
//                return data;
//            } else {
//                SimpleDateFormat sdf1 = new SimpleDateFormat(format1);
//                SimpleDateFormat sdf2 = new SimpleDateFormat(format2);
//                dateResult = sdf2.format(sdf1.parse(data));
//            }
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "日期为：" + data + ",由这个" + format1 + "格式转换成" + format2 + "失败", LogUtil.EMPTY, e);
//        }
//        return dateResult;
//    }

    /**
     * 指定日期，期限单位，期限计算日期
     *
     * @param beginDate 指定日期
     * @param type      期限单位  // 1：月，2：年，3：日
     * @param value     期限
     * @param pattern   日期格式，例如yyyyMMddHHmmss,默认：yyyyMMddHHmmss
     *                  throws ParseException
     *                  throws Exception
     */
//    public static String dateTerm(Date beginDate, int type, int value, String pattern) throws ParseException, Exception {
//        try {
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(beginDate);
//            if (type == 1) {
//                calendar.add(Calendar.MONTH, value);
//            } else if (type == 2) {
//                calendar.add(Calendar.YEAR, value);
//            } else if (type == 3) {
//                calendar.add(Calendar.DATE, value);
//            }
//
//            return DateToString(calendar.getTime(), pattern == null ? "yyyyMMddHHmmss" : pattern);
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "日期为" + beginDate + "计算类型为：" + type + "加上" + value + "失败", e);
//        }
//    }

    /**
     * 指定日期，期限单位，期限计算日期 天数减去一天
     *
     * @param beginDate 指定日期
     * @param type      期限单位  // 1：月，2：年，3：日
     * @param value     期限
     * @param pattern   日期格式，例如yyyyMMddHHmmss,默认：yyyyMMddHHmmss
     *                  throws ParseException
     *                  throws Exception
     */
//    public static String billDateTerm(Date beginDate, int type, int value, String pattern) throws ParseException, Exception {
//        try {
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(beginDate);
//            if (type == 1) {
//                calendar.add(Calendar.MONTH, value);
//            } else if (type == 2) {
//                calendar.add(Calendar.YEAR, value);
//            } else if (type == 3) {
//                calendar.add(Calendar.DATE, value);
//            }
//            return DateToString(calendar.getTime(), pattern == null ? "yyyyMMdd" : pattern);
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL_BILL, "日期为" + beginDate + "计算类型为：" + type + "加上" + value + "失败", e);
//        }
//    }

    /**
     * 查询指定日期相减的时间
     * throws ParseException
     * throws Exception
     */
//    public static String billBeforeDateTerm(Date beginDate, int type, int value, String pattern) throws ParseException, Exception {
//        try {
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(beginDate);
//            if (type == 1) {
//                calendar.add(Calendar.MONTH, value);
//            } else if (type == 2) {
//                calendar.add(Calendar.YEAR, value);
//            } else if (type == 3) {
//                calendar.add(Calendar.DATE, value);
//            }
//            calendar.add(Calendar.DATE, -1);
//            return DateToString(calendar.getTime(), pattern == null ? "yyyyMMdd" : pattern);
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL_BILL, "日期为" + beginDate + "计算类型为：" + type + "加上" + value + "失败", e);
//        }
//    }
    
    /**
     * 计算账单日期，按照抱财格式生成固定的日期
     *
     * @param beginDate 开始时间
     * @param type      期限单位  // 1：月，2：年，3：日
     * @param value     期限
     * @param pattern   日期格式，例如yyyyMMddHHmmss,默认：yyyyMMddHHmmss
     *                  throws ParseException
     *                  throws Exception
     */
//    @SuppressWarnings("deprecation")
//    public static String baocaiBillTerm(Date beginDate, int type, int value, int term, String pattern) throws ParseException, Exception {
//        try {
//            String endDate = billDateTerm(beginDate, type, term, pattern);
//            Date endBillDate = JavaUtil.StringToDate(endDate, "yyyyMMdd");
//            int days = endBillDate.getDate();
//            days = days - 1;
//            if (days == 0) {
//                days = 30;
//            }
//            String billDay = billBeforeDateTerm(beginDate, type, value, pattern);
//            Date billDate = StringToDate(billDay, "yyyyMMdd");
//            Calendar time = Calendar.getInstance();
//            time.clear();
//            int year = Integer.parseInt(billDay.substring(0, 4));
//            int month = billDate.getMonth();
//            if (month == 1 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && days > 28) {
//                days = 29;
//            } else if (month == 1 && days > 28) {
//                days = 28;
//            }
//            time.set(year, month, days);
//            return DateToString(time.getTime(), "yyyyMMdd");
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_BAOCAI_UTIL_BILL, "日期为" + beginDate + "计算类型为：" + type + "加上" + value + "失败", e);
//        }
//    }

    /**
     * 格式化金额，单位由万元转换成元
     *
     * @param amount 金额
     *               throws Exception
     */
    public static String formatAmount(Object amount) throws Exception {
//        LogUtil.info("需要格式化的金额值为：" + amount);
        String amountStr = "0";
        try {
            if (amount != null) {
                BigDecimal big = new BigDecimal("".equals(amount) ? "0" : amount.toString().replace(",", ""));
                big = big.multiply(new BigDecimal(10000)).setScale(2, BigDecimal.ROUND_UP);
                amountStr = big.toString();
            }
            return amountStr;
        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "格式化金额失败，格式化的金额为：" + amount, e);
            throw  e;
        }
    }

    /**
     * 将金额从元单位转换成万元
     * <p>
     * throws Exception
     */
    public static BigDecimal divideAmt(BigDecimal amt) throws Exception {
        BigDecimal bd;
        try {
            amt = (amt == null) ? new BigDecimal("0") : amt;
            bd = amt.divide(new BigDecimal(10000));
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "将金额从元单位转换成万元失败,需要转换的金额值为：" + amt, e);
            throw e;
        }
        return bd;
    }

    /**
     * 保留两位小数
     */
    public static String saveTwoPoint(BigDecimal amt) {
        DecimalFormat df = new DecimalFormat("0.00");
        if (null != amt) {
            return df.format(amt);
        }
        return df.format(0);
    }

    /**
     * 保留多位小数
     */
    public static String saveMorePoint(BigDecimal amt, int num) {
        StringBuffer buffer = null;
        if (num == 0) buffer = new StringBuffer("0");
        if (num < 0 || isEmpty(num)) {
            buffer = new StringBuffer("0.");
            buffer.append("00");
        } else if (num > 0) {
            buffer = new StringBuffer("0.");
            for (int i = 0; i < num; i++) {
                buffer.append("0");
            }
        }
        DecimalFormat df = new DecimalFormat(buffer.toString());
        if (null != amt) {
            return df.format(amt);
        }
        return df.format(0);
    }

    /**
     * 去掉右侧的0 如果没有小数点直接返回
     */
    public static String trimUtil(String str, char rpx) {
        int len = str.length();
        int st = 0;
        char[] val = str.toCharArray();
        /*
         * while ((st < len) && (val[st] == rpx)) { st++; }
         */
        while ((st < len) && (val[len - 1] == rpx)) {
            len--;
        }
        String strVal = len < str.length() ? str.substring(st, len) : str;
        if (strVal.lastIndexOf(".") == strVal.length() - 1)
            strVal = strVal + "00";
        return strVal;

    }

    /**
     * 根据URL下载文件
     *
     * @param url 地址
     * @param dir 本地路径
     */
//    public static File downloadFromUrl(String url, String dir) {
//        File f = null;
//        try {
//            URL httpUrl = new URL(url);
//            String fileSaveName = JavaUtil.DateToString(new Date(), "yyyyMMddhhmmss") + ".txt";
//            f = new File(dir + fileSaveName);
////            FileUtils.copyURLToFile(httpUrl, f);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return f;
//    }

    /**
     * 获取文件名
     *
     * @param url 文件地址
     */
    public static String getFileNameFromUrl(String url) {
        String name = Long.toString(System.currentTimeMillis()) + ".X";
        int index = url.lastIndexOf("/");
        if (index > 0) {
            name = url.substring(index + 1);
            if (name.trim().length() > 0) {
                return name;
            }
        }
        return name;
    }

    // 获取当天n点
    public static Date getInstanceTime(String n) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(n));
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return new Date((calendar.getTimeInMillis() / 1000) * 1000);
    }

    /**
     * 支持十亿以下转化为简体中文
     */
    public static String UpperToSimple(int n) {
        String fraction[] = {"角", "分"};
        String digit[] = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String unit[][] = {{"元", "万", "亿"}, {"", "十", "百", "千"}};
        String head = n < 0 ? "负" : "";
        n = Math.abs(n);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < fraction.length; i++) {
            s.append((digit[(int) (Math.floor(n * 10 * Math.pow(10, i)) % 10)] + fraction[i]).replaceAll("(零.)+", ""));
        }
        if (s.length() < 1) {
            s = new StringBuilder("整");
        }
        int integerPart = (int) Math.floor(n);
        for (int i = 0; i < unit[0].length && integerPart > 0; i++) {
            StringBuilder p = new StringBuilder();
            for (int j = 0; j < unit[1].length && n > 0; j++) {
                p.insert(0, digit[integerPart % 10] + unit[1][j]);
                integerPart = integerPart / 10;
            }
            s.insert(0, p.toString().replaceAll("(零.)*零$", "").replaceAll("^$", "零") + unit[0][i]);
        }
        return head
                + s.toString().replaceAll("(零.)*零元", "元").replaceFirst("(零.)+", "").replaceAll("(零.)+", "零").replaceAll("^整$", "零元整").replaceAll("整", "")
                .replaceAll("元", "");
    }


//    public static int getMonth(String date1, String date2) throws ParseException, Exception {
//        int result;
//        SimpleDateFormat Format = new SimpleDateFormat("yyyyMMddHHmmss");
//        /*
//         * int num = 14-date1.length(); for(int i=0;i<num;i++){ date1+="0"; }
//         */
//        date1 = StringUtil.rightPad(date1, 14, "0");
//        int days = Math.abs(computeDays(Format.parse(date1), Format.parse(date2)));
//        double day = days / 30d;
//        result = (int) Math.ceil(day);
//        result = result == 0 ? 1 : result;
//        return result;
//    }

    /**
     * 删除文件夹 以及文件夹下的所有内容
     */
    public static void delFolder(String folderPath) throws Exception {
        try {
            delAllFile(folderPath); // 删除完里面所有内容
            File myFilePath = new File(folderPath);
            myFilePath.delete(); // 删除空文件夹
        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "删除文件夹 以及文件夹下的所有内容失败 参数：" + folderPath, LogUtil.EMPTY, e);
        }
    }

    /**
     * 删除指定文件夹下所有文件 param path 文件夹完整绝对路径
     * throws Exception
     */
    public static boolean delAllFile(String path) throws Exception {
        boolean flag = false;
        File file = new File(path);
        if (!file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return false;
        }
        String[] tempList = file.list();
        File temp;
        for (String aTempList : tempList) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + aTempList);
            } else {
                temp = new File(path + File.separator + aTempList);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + aTempList);// 先删除文件夹里面的文件
                delFolder(path + "/" + aTempList);// 再删除空文件夹
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 获得日期的下一个星期一的日期
     */
    public static Calendar getNextMonday(Calendar date) {
        Calendar result;
        result = date;
        do {
            result = (Calendar) result.clone();
            result.add(Calendar.DATE, 1);
        } while (result.get(Calendar.DAY_OF_WEEK) != 2);
        return result;
    }

    /**
     * 获取两个日期之间相隔的自然日天数 两个参数先后顺序无所谓，默认d2>d1 ,如果d1>d2 会自动互换d1，d2
     */
    public static int getDaysBetween(Calendar d1, Calendar d2) {
        // swap dates so that d1 is start and d2 is end
        if (d1.after(d2)) {
            Calendar swap = d1;
            d1 = d2;
            d2 = swap;
        }
        int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
        int y2 = d2.get(Calendar.YEAR);
        if (d1.get(Calendar.YEAR) != y2) {
            d1 = (Calendar) d1.clone();
            do {
                days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);
                d1.add(Calendar.YEAR, 1);
            } while (d1.get(Calendar.YEAR) != y2);
        }
        return days;
    }

    /**
     * 计算2个日期之间的相隔的自然日天数 结果 >=0 两个参数先后顺序无所谓，默认d2>d1 ,如果d1>d2 会自动互换d1，d2
     *
     * @param d1 date类型
     * @param d2 date类型
     */
    public static int getDaysBetween(Date d1, Date d2) {
        int result = 0;
        if (d1 != null && d2 != null) {
            Calendar cl1 = Calendar.getInstance();
            cl1.setTime(d1);
            Calendar cl2 = Calendar.getInstance();
            cl2.setTime(d2);
            result = getDaysBetween(cl1, cl2);
        }
        return result;
    }

    /**
     * 计算2个日期之间的相隔的工作日天数 结果 >=0 两个参数先后顺序无所谓，默认d2>d1 ,如果d1>d2 会自动互换d1，d2
     *
     * @param d1 Calendar类型
     * @param d2 Calendar类型
     */
    public static int getWorkingDay(Calendar d1, Calendar d2) {
        int result;
        if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
            Calendar swap = d1;
            d1 = d2;
            d2 = swap;
        }
        int charge_start_date = 0;// 开始日期的日期偏移量
        int charge_end_date = 0;// 结束日期的日期偏移量
        // 日期不在同一个日期内
        int sTmp;
        int eTmp;
        sTmp = 7 - d1.get(Calendar.DAY_OF_WEEK);
        eTmp = 7 - d2.get(Calendar.DAY_OF_WEEK);
        if (sTmp != 0 && sTmp != 6) {// 开始日期为星期六和星期日时偏移量为0
            charge_start_date = sTmp - 1;
        }
        if (eTmp != 0 && eTmp != 6) {// 结束日期为星期六和星期日时偏移量为0
            charge_end_date = eTmp - 1;
        }
        result = (getDaysBetween(getNextMonday(d1), getNextMonday(d2)) / 7) * 5 + charge_start_date - charge_end_date;
        return result;
    }

    /**
     * 计算2个日期之间的相隔的工作日天数 结果 >=0 两个参数先后顺序无所谓，默认d2>d1 ,如果d1>d2 会自动互换d1，d2
     *
     * @param d1 date类型
     * @param d2 date类型
     */
    public static int getWorkingDay(Date d1, Date d2) {
        int result = 0;
        if (d1 != null && d2 != null) {
            Calendar cl1 = Calendar.getInstance();
            cl1.setTime(d1);
            Calendar cl2 = Calendar.getInstance();
            cl2.setTime(d2);
            getWorkingDay(cl1, cl2);
        }
        return result;
    }

    /**
     * 根据标记类型 和大写数值，获取对应位数的大写值
     *
     * @param flag   //参数类型 ：0 :个位 1：十位 2：百位，3：千位；4：十分位；5：百分位
     * @param uppVal 传递的大写数值 小于1万
     */
    public static String getUpperAFlag(String flag, String uppVal) {

        String result = "零";

        if (flag != null && !"".equals(flag) && uppVal != null && !"".equals(uppVal)) {
            // 千位值
            if ("3".equals(flag) && uppVal.contains("仟")) {
                result = uppVal.substring(0, uppVal.indexOf("仟"));
            } else if ("2".equals(flag)) { // 百位值
                if (uppVal.contains("仟") && uppVal.contains("佰")) {
                    result = uppVal.substring(uppVal.indexOf("仟") + 1, uppVal.indexOf("佰"));
                } else if (!uppVal.contains("仟") && uppVal.contains("佰")) {
                    result = uppVal.substring(0, uppVal.indexOf("佰"));
                }
            } else if ("1".equals(flag)) { // 十位值
                if (uppVal.contains("佰") && uppVal.contains("拾")) {
                    result = uppVal.substring(uppVal.indexOf("佰") + 1, uppVal.indexOf("拾"));
                } else if (!uppVal.contains("佰") && uppVal.contains("拾")) {
                    if (uppVal.contains("仟")) {
                        result = uppVal.substring(uppVal.indexOf("仟") + 2, uppVal.indexOf("拾"));
                    } else {
                        result = uppVal.substring(0, uppVal.indexOf("拾"));
                    }
                }
            } else if ("0".equals(flag)) {// 个位值
                result = uppVal.substring(uppVal.length() - 1);
                if ("仟".equals(result) || "佰".equals(result) || "拾".equals(result)) {
                    result = "零";
                }
            } else if ("4".equals(flag) && uppVal.contains("角")) { // 十分位
                result = uppVal.substring(0, uppVal.indexOf("角"));
            } else if ("5".equals(flag)) { // 百分位
                if (!uppVal.contains("角") && uppVal.contains("分")) {
                    result = uppVal.substring(0, uppVal.indexOf("分"));
                } else if (uppVal.contains("角") && uppVal.contains("分")) {
                    result = uppVal.substring(uppVal.indexOf("角") + 1, uppVal.indexOf("分"));
                }
            }
        }
        return result;
    }

//    /**
//     * 创建ZIP文件
//     *
//     * @param sourcePath 文件或文件夹路径
//     * @param zipPath    生成的zip文件存在路径（包括文件名）
//     */
//    public static void createZip(String sourcePath, String zipPath) throws Exception {
//        FileOutputStream fos;
//        ZipOutputStream zos = null;
//        try {
//            fos = new FileOutputStream(zipPath);
//            zos = new ZipOutputStream(fos);
//            writeZip(new File(sourcePath), "", zos);
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "创建ZIP文件失败，文件路径：" + sourcePath, LogUtil.EMPTY, e);
//        } finally {
//            close(zos);
//        }
//    }

//    /**
//     * 创建ZIP文件  文件夹深度为3级
//     *
//     * @param docs
//     *            文件
//     * @param zipPath
//     *            生成的zip文件存在路径（包括文件名）
//     */
//    public static void createZip(List<String> docs, String zipPath)
//            throws Exception {
//        FileOutputStream fos = null;
//        ZipOutputStream zos = null;
//        Set<String> set =  new HashSet<>();
//        set.addAll(docs);
//        try {
//            try {
//                List<File> files = new ArrayList<>();
//                for(String doc : set){
//                    File file = new File(doc);
//                    if(file.exists()){
//                        files.add(file);
//                    }
//                }
//                fos = new FileOutputStream(zipPath);
//                zos = new ZipOutputStream(fos);
//                writeZip(files, "", zos);
//            } catch (FileNotFoundException e) {
//                LogUtil.warn("创建ZIP文件失败", e);
//            } finally {
//                try {
//                    if (zos != null) {
//                        zos.close();
//                    }
//                } catch (IOException e) {
//                    LogUtil.warn("创建ZIP文件失败", e);
//                }
//
//            }
//        } catch (Exception e) {
//            Exception tfe = null;
//            if (e instanceof Exception) {
//                tfe = (Exception) e;
//                LogUtil.warn("错误码:" + tfe.errorCode + ",错误信息:" + tfe.errorMsg,
//                        tfe);
//            } else {
//                tfe = new Exception(CommonErrorCode.PUB_JAVA_UTIL, "图片下载出错",
//                        e);
//                LogUtil.warn("将文件压缩到指定目录失败，错误码:" + CommonErrorCode.PUB_JAVA_UTIL
//                        + ",错误信息:将文件压缩到指定目录失败", tfe);
//            }
//            throw tfe;
//        }
//    }

//    /**
//     * 把制定文件下的所有文件进行zip压缩
//     *
//     * @param file            : 某个文件或者文件夹
//     * @param parentPath：父级目录 throws Exception
//     */
//    private static void writeZip(File file, String parentPath, ZipOutputStream zos) throws Exception {
//        FileInputStream fis = null;
//        try {
//            if (file.exists()) {
//                if (file.isDirectory()) {// 处理文件夹
//                    parentPath += file.getName() + File.separator;
//                    File[] files = file.listFiles();
//                    if (files != null) {
//                        for (File f : files) {
//                            writeZip(f, parentPath, zos);
//                        }
//                    }
//                } else {
//                    fis = new FileInputStream(file);
//                    ZipEntry ze = new ZipEntry(parentPath + file.getName());
//                    zos.putNextEntry(ze);
//                    byte[] content = new byte[1024];
//                    int len;
//                    while ((len = fis.read(content)) != -1) {
//                        zos.write(content, 0, len);
//                        zos.flush();
//                    }
//                }
//            }
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "压缩某个文件失败", LogUtil.EMPTY, e);
//        } finally {
//            close(fis);
//        }
//    }

//    private static void writeZip(List<File> files, String parentPath,
//                                 ZipOutputStream zos) throws Exception {
//        try {
//            for(File file : files) {
//                if (file.exists()) {
//                    if (!file.isDirectory()) {
//                        FileInputStream fis = null;
//                        try {
//                            fis = new FileInputStream(file);
//                            ZipEntry ze = new ZipEntry(parentPath + file.getName());
//                            zos.putNextEntry(ze);
//                            byte[] content = new byte[1024];
//                            int len;
//                            while ((len = fis.read(content)) != -1) {
//                                zos.write(content, 0, len);
//                                zos.flush();
//                            }
//
//                        } catch (FileNotFoundException e) {
//                            LogUtil.warn("创建ZIP文件失败", e);
//                            throw e;
//                        } catch (IOException e) {
//                            LogUtil.warn("创建ZIP文件失败", e);
//                            throw e;
//                        } finally {
//                            try {
//                                if (fis != null) {
//                                    fis.close();
//                                }
//                            } catch (IOException e) {
//                                LogUtil.warn("创建ZIP文件失败", e);
//                                throw e;
//                            }
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            Exception tfe = null;
//            if (e instanceof Exception) {
//                tfe = (Exception) e;
//                LogUtil.warn("错误码:" + tfe.errorCode + ",错误信息:" + tfe.errorMsg,
//                        tfe);
//            } else {
//                tfe = new Exception(CommonErrorCode.PUB_JAVA_UTIL,
//                        "创建压缩文件失败", e);
//                LogUtil.warn("创建压缩文件失败，错误码:" + CommonErrorCode.PUB_JAVA_UTIL
//                        + ",错误信息:创建压缩文件失败", tfe);
//            }
//            throw tfe;
//        }

//    }
    /**
     * 取得两个日期之间相隔年，向下取整
     *
     * @param dateStart 精确到日
     * @param dateEnd   精确到日
     */
    @SuppressWarnings("deprecation")
    public static int completeYears(Date dateStart, Date dateEnd) {
        int year;
        int yearStart = dateStart.getYear();
        int monthStart = dateStart.getMonth();
        int dayStart = dateStart.getDate();
        int yearEnd = dateEnd.getYear();
        int monthEnd = dateEnd.getMonth();
        int dayEnd = dateEnd.getDate();
        year = yearEnd - yearStart;
        if ((monthEnd - monthStart) < 0) {
            year = year - 1;
        } else {
            if ((dayEnd - dayStart) < 0) {
                year = year - 1;
            }
        }
        return year;
    }

    /**
     * 比较两个日期， 若date1>date2 ，返回true
     * throws ParseException
     */
    public static boolean compareDate(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        boolean flag = false;
        if (sdf.parse(date1).getTime() > sdf.parse(date2).getTime()) { // date1>date2
            flag = true;
        }
        return flag;
    }

    /**
     * 处理null或空值
     *
     * @param objValue     源对象
     * @param replaceValue 要替换的字符串
     * @return 返回字符串
     */
    public static String noeConverStr(Object objValue, String replaceValue) {
        if (objValue == null || objValue.toString().length() == 0) {
            objValue = replaceValue;
        }
        return objValue.toString();
    }

    /**
     * 返回字符串 四位一空格
     *
     * @param orgStr 源字符串
     */
    public static String fourEmpty(Object orgStr, int scale) {
        if (orgStr == null || orgStr.toString().length() == 0) {
            return "";
        }
        char c[] = orgStr.toString().toCharArray();
        StringBuilder resultVal = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (i % scale == 0 && i != 0) {
                resultVal.append(" ").append(c[i]);
            } else {
                resultVal.append(c[i]);
            }
        }
        return resultVal.toString();
    }

    /**
     * 生成验证码
     */
    public static String identifyCode() {
        String str = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        String str2[] = str.split(",");// 将字符串以,分割
        Random rand = new Random();// 创建Random类的对象rand
        int index;
        StringBuilder randStr;// 创建内容为空字符串对象randStr
        randStr = new StringBuilder();// 清空字符串对象randStr中的值
        for (int i = 0; i < 4; ++i) {
            index = rand.nextInt(str2.length - 1);// 在0到str2.length-1生成一个伪随机数赋值给index
            randStr.append(str2[index]);// 将对应索引的数组与randStr的变量值相连接
        }
        return randStr.toString();
    }

    /**
     * 两个实体之间转化空值处理
     */
    public static BeanUtilsBean registerDefaultValue() {
        BeanUtilsBean beanUtilsBean = new BeanUtilsBean();
        beanUtilsBean.getConvertUtils().register(new org.apache.commons.beanutils.converters.BigDecimalConverter(null), BigDecimal.class);
        beanUtilsBean.getConvertUtils().register(new org.apache.commons.beanutils.converters.DateConverter(null), Date.class);
        return beanUtilsBean;
    }

    /**
     * 把第二个map的值合并到另外第一个map中
     *
     * @param filter:不需要合并 数据格式为key|key1|key2
     */
    public static Map<String, Object> mergeMap(Map<String, Object> map, Map<String, Object> param, String filter) {
        if (param != null) {
            String[] filterArray = {};
            if (filter != null) {
                filterArray = filter.split("\\|");
            }
            for (String key : param.keySet()) {
                key = key.trim();
                boolean putFlag = false; // 是否过滤，true过滤
                for (String keyFilter : filterArray) {
                    putFlag = key.equals(keyFilter);
                }
                if (!putFlag) {
                    Object value = param.get(key);
                    map.put(key, value);
                }
            }
        }
        return map;
    }

    /**
     * 计算两个日期之间相差的毫秒数
     * <p>
     * throws ParseException
     */
//    public static long dateDiff(String frontDate, String afterDate) throws Exception {
//        long diffSec;
//        try {
//            SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmss");
//            long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
//            long nh = 1000 * 60 * 60;// 一小时的毫秒数
//            long nm = 1000 * 60;// 一分钟的毫秒数
//            long ns = 1000;// 一秒钟的毫秒数
//            long diff;
//            diff = sd.parse(afterDate).getTime() - sd.parse(frontDate).getTime();
//            long day = diff / nd;// 计算差多少天
//            long hour = diff % nd / nh;// 计算差多少小时
//            long min = diff % nd % nh / nm;// 计算差多少分钟
//            long sec = diff % nd % nh % nm / ns;// 计算差多少秒//输出结果
//            diffSec = sec + min * 60 + hour * 3600 + day * 24 * 3600;
//            if (diffSec < 0) {
//                diffSec = 0 - diffSec;
//            }
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "计算两个日期相隔的毫米数失败,参数为:" + frontDate + "|" + afterDate, LogUtil.EMPTY, e);
//        }
//        return diffSec;
//    }

//    /**
//     * 反射工具类
//     *
//     * @param className:类名
//     * @param methodName：方法名
//     * @param contJson：方法的执行参数 throws Exception
//     */
//    public static Object reflectUtil(String className, String methodName, JSONObject contJson) throws Exception {
//        Object result = null;
//        try {
//            Class<?> clz = Class.forName(className); //加载类
//            Object oTargetObject = ClusterQuartzJobProvider.getBean(clz); //获取bean
//            Method method; //获取动态执行方法
//            if (oTargetObject != null) {
//                method = oTargetObject.getClass().getMethod(methodName, new Class[]{String.class});
//                result = method.invoke(oTargetObject, new Object[]{contJson.toString()});
//            }
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "反射调用失败，参数为:" + className + "|" + methodName, LogUtil.EMPTY, e);
//        }
//        return result;
//    }

    /**
     * 将一个bean转换为Map
     * <p>
     * throws IllegalArgumentException
     * throws IllegalAccessException
     */
    public static Map<String, Object> modelToMap(Object bean) throws IllegalArgumentException, IllegalAccessException {
        Field[] fields = bean.getClass().getDeclaredFields();
        HashMap<String, Object> data = new HashMap<>();
        for (Field field : fields) {
            field.setAccessible(true);
            data.put(field.getName(), field.get(bean));
        }
        return data;
    }

    /**
     * 将一个Object类型转换为Map
     * <p>
     * throws Exception
     */
//    public static Object convertMap(Class<?> classObj, Map<String, Object> map) throws Exception {
//        Object obj;
//        try {
//            BeanInfo beanInfo = Introspector.getBeanInfo(classObj); // 获取类属性
//            obj = classObj.newInstance(); // 创建 JavaBean 对象
//            // 给 JavaBean 对象的属性赋值
//            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
//            for (PropertyDescriptor descriptor : propertyDescriptors) {
//                String propertyName = descriptor.getName();
//                if (map.containsKey(propertyName)) {
//                    // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
//                    Object value = map.get(propertyName);
//                    Object[] args = new Object[1];
//                    args[0] = value;
//                    descriptor.getWriteMethod().invoke(obj, args);
//                }
//            }
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "将一个Object类型转换为Map失败，参数为:" + map, LogUtil.EMPTY, e);
//        }
//        return obj;
//    }

//    /**
//     * 获取session中的用户，获取不到默认系统自动
//     * <p>
//     * throws Exception
//     */
//    public static String getSessionOpNo() throws Exception {
//        String operatorNo;
//        try {
//            operatorNo = SessionUtil.getCurrentUser() == null ? CommonConstants.OP_NO : SessionUtil.getCurrentUser().getUserNo();
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "获取session中操作员编号出错", LogUtil.EMPTY, e);
//        }
//        return operatorNo;
//    }

//    /**
//     * 获取session中的用户，获取不到默认系统自动
//     * <p>
//     * throws Exception
//     */
//    public static String getSessionOpName() throws Exception {
//        String opName;
//        try {
//            opName = SessionUtil.getCurrentUser() == null ? CommonConstants.OP_NAME : SessionUtil.getCurrentUser().getUserName();
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "获取session中操作员姓名出错", LogUtil.EMPTY, e);
//        }
//        return opName;
//    }

//    /**
//     * 关闭流
//     * <p>
//     * throws Exception
//     */
//    public static void close(Closeable closeable) throws Exception {
//        if (closeable != null) {
//            try {
//                closeable.close();
//            } catch (Exception e) {
//                throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "关闭流异常", LogUtil.EMPTY, e);
//            }
//        }
//    }

//    /**创建文件临时路径
//     * @param extendName：文件的扩展名，例如:pdf,doc,jpg等
//     * @param saveType：临时文件创建类型：参加Constants临时文件创建类型
//     *         上传：Constants.FILE_UPLOAD
//     *         下载：Constants.FILE_DOWN
//     * @return fileSaveName： 根路径 + 父级目录 + 日期 + 系统时间秒串 + "-" + 8位随机数 + . + 扩展名
//     * @throws Exception
//     */
//    public static String creatFilePath(String extendName,String saveType) throws Exception{
//        String fileSaveName = null;
//        try{
//            String fileRoot = SysParamUtil.getSysParValue("FILE_ROOT");  //文件存储根路径
//            String fileSavePath = SysParamUtil.getSysParValue(saveType);  //文件临时路径
//            String path = fileRoot + fileSavePath + JavaUtil.DateToString(new Date(), "yyyyMMdd") + "/";// 定义上传路径
//            JavaUtil.createDirectory(path); // 创建文件路径
//            String key = (int)((Math.random()*9+1)*100000)+"";
//            fileSaveName = path + System.currentTimeMillis() + "-" + key + "." + extendName;
//        }catch(Exception e){
//            throw LogUtil.handerEx(PubErrorCode.PUB_JAVA_UTIL, "生成临时文件路径失败，参数为："+extendName, LogUtil.EMPTY, e);
//        }
//       return fileSaveName;
//    }

//    /**
//     * @param code:http响应码 throws Exception
//     */
//    public static boolean checkResponse(int code) throws Exception {
//        boolean repCode = false;
//        switch (code) {
//            case 200:
//                LogUtil.info("请求正确，http响应码：" + code);
//                repCode = true;
//                break;
//            case 504:
//                LogUtil.info("网关超时，http响应码：" + code);
//                break;
//            default:
//                LogUtil.info("请求错误，http响应码：" + code);
//                break;
//        }
//        if (!repCode) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "http响应码失败，响应码为： " + code);
//        }
//        return true;
//    }

//    /**
//     * 从请求参数中获取单个文件信息
//     * 备注：默认获取多个文件中第一文件
//     *
//     * @param reqMap:请求参数 throws Exception
//     */
//    public static String getReqFirstFile(Map<String, Object> reqMap) throws Exception {
//        String fileString = null;
//        try {
//            @SuppressWarnings("unchecked")
//            List<String> fileObj = (List<String>) reqMap.get(CommonConstants.FILE_KEY);
//            if (fileObj != null && fileObj.size() > 0) {
//                fileString = fileObj.get(0);
//            }
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "获取请求map中第一个文件失败，参数为： " + reqMap);
//        }
//        return fileString;
//    }

    /**
     * 将JSONArray 转化为String 数组
     */
    public static String[] getJsonToStringArray(JSONArray jsonArray) {
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
            arr[i] = jsonArray.getString(i);
        }
        return arr;
    }

    /**
     * json字符串转list
     * @param jsonFile
     * @return
     * @throws Exception
     * @author 64k-chen
     */
    public static List<Map<String, String>> GetJsonListByString(String jsonFile) throws Exception
    {
        JSONArray arry = JSONArray.fromObject(jsonFile);
        List<Map<String, String>> rsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < arry.size(); i++)
        {
            JSONObject jsonObject = arry.getJSONObject(i);
            Map<String, String> map = new HashMap<String, String>();
            for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();)
            {
                String key = (String) iter.next();
                String value = jsonObject.get(key).toString();
                map.put(key, value);
            }
            rsList.add(map);
        }
        return rsList;
    }

    /**
     * 判断手机号格式是否正确
     */
    public static boolean validatePhone(String mobile) {
        if (mobile == null) {
//            LogUtil.info("手机号码不能为空！");
            /*^匹配开始地方$匹配结束地方，[3|4|5|7|8]选择其中一个{4,8},\d从[0-9]选择 
            {4,8}匹配次数4~8    ，java中/表示转义，所以在正则表达式中//匹配/,/匹配""*/
            //验证手机号码格式是否正确
        } else if (!mobile.matches("^1[34578][0-9]\\d{4,8}$")) {
//            LogUtil.info("手机号输入有误，请重新输入");
            return false;
        } else {
            return true;
        }
        return false;
    }

    /**
     * 计算日期之间时间差（分钟）
     *
     * @param nowTime "yyyy-MM-dd HH:mm"
     * @param time    "yyyy-MM-dd HH:mm"
     *                throws ParseException
     */
    public static int minite(String nowTime, String time) throws ParseException {
//        LogUtil.info("当前时间  nowtime=" + nowTime + "------time=" + time);
        int minutes = 0;
        if (!StringUtils.isEmpty(nowTime) && !StringUtils.isEmpty(time)) {
            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            long from = simpleFormat.parse(nowTime).getTime();
            long to = simpleFormat.parse(time).getTime();
            minutes = (int) ((to - from) / (1000 * 60));
        }
//        LogUtil.info("返回的分钟差值==minutes=" + minutes);
        return minutes;
    }

    /**
     * 获得两个日期之间的分钟数
     *
     * @param beginDate 开始日期
     * @param endDate   结束日期
     * @param pattern   类型
     *                  throws ParseException
     */
    public static int getMinutes(String beginDate, String endDate, String pattern) throws ParseException {
        int minutes = 0;
        if (!StringUtils.isEmpty(beginDate) && !StringUtils.isEmpty(endDate)) {
            SimpleDateFormat simpleFormat = new SimpleDateFormat(pattern);
            long begin = simpleFormat.parse(beginDate).getTime();
            long end = simpleFormat.parse(endDate).getTime();
            minutes = (int) ((end - begin) / (1000 * 60));
        }
        return minutes;
    }




    /**
     * 缩放图片
     *
     * @param inputImageUrl  目标图片地址  例如 ：F:\\微信公众号大\\qudao_test.jpg
     * @param outputImageUrl 缩放后的图片地址  例如：E:\\images\\aa.jpg
     * @param width          缩放后的宽度       1800
     * @param height         缩放后的高度       180
     * @param postfixName    图片后缀              PNG
     *                       throws Exception
     */
    public void scalingImage(String inputImageUrl, String outputImageUrl, int width, int height, String postfixName) {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            //读取图片
            in = new BufferedInputStream(new FileInputStream(inputImageUrl));
            //字节流转图片对象
            Image bi = ImageIO.read(in);
            //获取图像的高度，宽度
            //int height=bi.getHeight(null);
            //int width =bi.getWidth(null);
            //构建图片流
            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //绘制改变尺寸后的图
            tag.getGraphics().drawImage(bi, 0, 0, width, height, null);
            //输出流
            out = new BufferedOutputStream(new FileOutputStream(outputImageUrl));
            //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            //encoder.encode(tag);
            ImageIO.write(tag, postfixName, out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
                if (null != out) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 计算出上传日期与当前日期的间隔天数，日期在今天之前返回负数当天返回0当天之后返回正数
     *
     * @param date 上传的日期
     * @return 间隔天数
     * throws Exception 默认999999错误
     */
//    public static int compareDaysWithNow(Date date) throws Exception {
//        /*
//         * 1、参数处理
//         */
//        String day1 = DateToString(date, "yyyyMMddHHmmss");
//        String nowTime = DateToString(new Date(), "yyyyMMdd");
//        String day2 = DateToString(StringToDate(nowTime, "yyyyMMdd"), "yyyyMMddHHmmss");
//        day1 = day1.trim();
//        day2 = day2.trim();
//        if ("".equals(day1) || "".equals(day2) || day1.length() != 14 || day2.length() != 14) {
//            return 999999;
//        }
//        int num = 0;
        /*
         * 2、数据处理
         */
//        String y1 = day1.substring(0, 4); // 年
//        String m1 = day1.substring(4, 6); // 月
//        String d1 = day1.substring(6, 8); // 日
//        String h1 = day1.substring(8, 10); // 时
//        String min1 = day1.substring(10, 12); // 分
//        String s1 = day1.substring(12, 14); // 秒
//
//        String y2 = day2.substring(0, 4);
//        String m2 = day2.substring(4, 6);
//        String d2 = day2.substring(6, 8);
//        String h2 = day2.substring(8, 10); // 时
//        String min2 = day2.substring(10, 12); // 分
//        String s2 = day2.substring(12, 14); // 秒
//
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.set(Integer.parseInt(y1), Integer.parseInt(m1) - 1, Integer.parseInt(d1), Integer.parseInt(h1), Integer.parseInt(min1),
//                Integer.parseInt(s1));
//        c2.set(Integer.parseInt(y2), Integer.parseInt(m2) - 1, Integer.parseInt(d2), Integer.parseInt(h2), Integer.parseInt(min2),
//                Integer.parseInt(s2));
        /*
         * 3、数据计算
         */
//        if (c1.after(c2)) {
//            for (; c2.before(c1); ) {
//                c2.add(Calendar.DATE, 1);
//                num++;
//            }
//        } else {
//            for (; c1.before(c2); ) {
//                c1.add(Calendar.DATE, 1);
//                num++;
//            }
//            num = -num;
//        }
//        return num;
//    }

    /**
     * 判断当前对象是否 空或者为null
     */
    public static boolean isEmpty(Object obj) {
        return null == obj || StringUtils.isEmpty(obj.toString()) || StringUtils.isBlank(obj.toString()) || "null".equals(obj.toString());
    }

    /**
     * 如果当前对象为空；则替换新值，否则返回当前值
     *
     * @param obj      旧值
     * @param newValue 新值
     */
    public static String isEmptyReplace(Object obj, String newValue) {
        if (isEmpty(obj))
            return newValue;
        else
            return obj.toString();
    }

    /**
     * 如果当前对象为空；则替换空，否则返回当前值
     *
     * @param obj 旧值
     */
    public static String isEmptyReplace(Object obj) {
        if (isEmpty(obj))
            return "";
        else
            return String.valueOf(obj);
    }

    /**
     * 数字保留两位小数
     */
    public static String formatNumTwo(String val) {
        BigDecimal bd = new BigDecimal(isEmptyReplace(val, "0"));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.toString();
    }

    /**
     * 判断一个字符串是否是设置的日期格式
     *
     * @param reqDate 请求字符串
     * @param pattern 日期样式
     * @return true:是  false:否
     * throws Exception
     */
    public static boolean isDateFormat(String reqDate, String pattern) {
        boolean dateFlag = true;
        try {
            SimpleDateFormat simple = new SimpleDateFormat(pattern);
            simple.parse(reqDate);
        } catch (ParseException e) {
            dateFlag = false;
        }
        return dateFlag;
    }


    /**
     * 获取上一年或者下一年
     *
     * @param date 当前日期
     * @param num  前或者后 计算的数量 、
     *             例如（当前时间 new Date() ,num = 1   下一年）
     *             例如（当前时间 new Date() ,num = -1  前一年）
     */
    public static Date getNextYear(Date date, int num) {
//        LogUtil.info("获取指定月份的时间 date=" + date + "---num=" + num);
        try {
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTime(date);
            aCalendar.add(Calendar.YEAR, num);
            return aCalendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 获取指定日期的前后几天
     * @param date
     * @param num
     * @return
     */
    public static Date getNextDay(Date date, int num) {
//        LogUtil.info("获取指定日期的前后几天" + date + "---num=" + num);
        try {
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTime(date);
            aCalendar.set(Calendar.DAY_OF_MONTH,aCalendar.get(Calendar.DAY_OF_MONTH)+num);//让日期加1  
            return aCalendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取下个或者上个月份
     *
     * @param date 当前日期
     * @param num  前或者后 计算的数量 、
     *             例如（当前时间 new Date() ,num = 1    下一个月）
     *             例如（当前时间 new Date() ,num = -1  前一个月）
     */
    public static Date getNextMonth(Date date, int num) {
//        LogUtil.info("获取指定月份的时间 date=" + date + "---num=" + num);
        try {
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTime(date);
            aCalendar.add(Calendar.MONTH, num);
            return aCalendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取系统日期的后count天
     */
    public static String getAfterDate(Date date, int count) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + count);
        return df.format(c.getTime());
    }
    /**
     * 
     * 描述:获取下一个月的第一天.
     * 
     * @return
     */
    public static String getPerFirstDayOfMonth() {
        SimpleDateFormat dft = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return dft.format(calendar.getTime());
    }
    /**
     * 
     * 描述:获取下个月的最后一天.
     * 
     * @return
     */
    public static String getLastMaxMonthDate() {
        SimpleDateFormat dft = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        return dft.format(calendar.getTime());
    }
    
    
    /**
     * 22、将时间转换为时间戳  
     * @param s  时间值
     * @param format  时间格式
     * @return
     * @throws ParseException
     */
    public static String dateToStamp(String s,String format) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }
    
    
    
    /**
     * 23、将时间戳转换为时间
     * @param s 时间
     * @param format  转换成的时间格式
     * @return
     */
    public static String stampToDate(String s,String format){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

//    /**
//     * 通过文件流转换成文件
//     * @param input
//     * @param filePath
//     * @return
//     */
//    public static File getFileByInput(InputStream input,String filePath) throws Exception{
//    	FileOutputStream fos = null;
//    	File file = null;
//    	try{
//        	 file = new File(filePath);
//             fos = new FileOutputStream(file);
//             byte[] buf = new byte[8096];
//             int size = 0;
//             while ((size = input.read(buf)) != -1)
//            	 fos.write(buf, 0, size);
//         }catch(Exception e){
//        	 e.printStackTrace();
//        	 throw LogUtil.handerEx("000012374", "通过文件流转换成文件，查询参数为：filePath" + filePath, LogUtil.ERROR, e);
//         }finally{
//        	 if(null != fos) fos.close();
//         }
//    	return file;
//    }
    
    
    /**
     * 去掉小数点后的多余的0
     * @param s
     * @return String
     */
    public static String subZeroAndDot(String s){  
        if(s.indexOf(".") > 0){  
            s = s.replaceAll("0+?$", "");//去掉多余的0  
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉  
        }  
        return s;  
    }
    
    /**
     * 获取某一时间的具体信息（例如某天或者某月）
     * @param date
     * @param type
     * 			01:年
     * 			02：月
     * 			03：周
     * 			04：日
     * 			05：时
     * 			06：分
     * 			07：秒
     * @return
     */
//    public static int getDateConcreteTime(Date date,String type) throws Exception{
//    	DateTimeFormatter matter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//    	LocalDateTime ldft = LocalDateTime.parse(DateToString(date, "yyyy-MM-dd HH:mm:ss"), matter);
//    	if(CommonConstants.TIME_TYPE_VALUE.YEAR.equals(type)){
//    		return ldft.getYear();
//    	}else if(CommonConstants.TIME_TYPE_VALUE.MONTH.equals(type)){
//    		return ldft.getMonthValue();
//    	}else if(CommonConstants.TIME_TYPE_VALUE.DAY.equals(type)){
//    		return ldft.getDayOfMonth();
//    	}else if(CommonConstants.TIME_TYPE_VALUE.HOUR.equals(type)){
//    		return ldft.getHour();
//    	}else if(CommonConstants.TIME_TYPE_VALUE.MINITE.equals(type)){
//    		return ldft.getMinute();
//    	}else if(CommonConstants.TIME_TYPE_VALUE.SSS.equals(type)){
//    		return ldft.getSecond();
//    	}
//    	return 0;
//    }
    
    /** 
     * 取得当月天数 
     * */  
    public static int getCurrentMonthLastDay(Date date)  
    {  
        Calendar a = Calendar.getInstance(); 
        a.setTime(date);
        a.set(Calendar.DATE, 1);//把日期设置为当月第一天  
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天  
        int maxDate = a.get(Calendar.DATE);  
        return maxDate;  
    } 
    /**
     * 设置指定月份的 指定天数
     * @param date  指定日期
     * @param day   指定日子
     * @return
     */
    public static Date setPointDate(Date date,int day){
    	//如果指定的day为0 则返回日期
    	if(0 == day) return date;
    	//格式转换
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
    	Calendar cal_1=Calendar.getInstance();//获取当前日期 
    	cal_1.setTime(date);
        cal_1.add(Calendar.MONTH, 0);
        cal_1.set(Calendar.DAY_OF_MONTH,day);//设置为1号,当前日期既为本月第一天 
        @SuppressWarnings("unused")
        String firstDay = format.format(cal_1.getTime());
        System.out.println(format.format(cal_1.getTime()));
        return cal_1.getTime();
    }
    
    /**
     * 将数字转化为指定长度的字符串  左侧补0
     * @param i     需要格式化的 数字
     * @param len   格式化的长度
     * @return
     */
    public static String getFormatNum(int i,int len){
        //得到一个NumberFormat的实例
        NumberFormat nummat = NumberFormat.getInstance();
        //设置是否使用分组
        nummat.setGroupingUsed(false);
        //设置最大整数位数
        nummat.setMaximumIntegerDigits(len);
        //设置最小整数位数    
        nummat.setMinimumIntegerDigits(len);
        return nummat.format(i);
    }

    public static byte[] getBytes(String filePath){
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
    
    
    /**
     * 获取姓名称呼
     *
     * @param sex 编号 0：女，1：男
     * @return
     */
    public static String getSexValue(String sex) {
        String call = "";
        switch (sex) {
            case "0":
                call = "女士";
                break;
            case "1":
                call = "先生";
                break;
            default:
                call = "";
                break;
        }
        return call;
    }
    
    
    /**
     * 通过时间秒毫秒数判断两个时间的天数
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDaysByMillisecond(Date date1,Date date2)
    {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;
    }
    //每3位中间添加逗号的格式化显示  
    public static String formatTosepara(BigDecimal data) {
    	String ruturnAmt = "0.00";
    	DecimalFormat df = new DecimalFormat("#,###.00"); 
        if(data != null && data.compareTo(new BigDecimal(0))>0){
        	ruturnAmt = df.format(data);
        }
    	return ruturnAmt;
    }
    /**
     * mov视频文件转 mp4
     * @param movFile  读文件绝对路径
     * @param mp4File  写文件绝对路径
     * @throws IOException
     */
    public static void convertMov2Mp4(String movFile,String mp4File) throws IOException {
        Runtime.getRuntime().exec("ffmpeg -i \""+movFile+"\" -vcodec copy -acodec copy \""+mp4File+"\"");
    }
    
    
    
//    /**
//     * 根据Url下载文件，返回文件路径
//     * @param url   请求URL
//     * @param fileName  文件名称
//     * @return
//     */
//    public static String downFlileFromUrl(String url, String fileName) {
//        String filePath = null;
//        try {
//            URL httpUrl = new URL(url);
//            File saveFile = new File(fileName);
//            FileUtils.copyURLToFile(httpUrl, saveFile);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return filePath;
//    }
    /***
     * 计算两个日期之间相差的天数
     * @param smdate
     * @param bdate
     * @return
     * @throws ParseException
     */
    public static int daysBetween(Date smdate,Date bdate) throws ParseException {    
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        smdate = sdf.parse(sdf.format(smdate));  
        bdate = sdf.parse(sdf.format(bdate));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();         
        long between_days = (time2-time1)/(1000*3600*24);  
        return Integer.parseInt(String.valueOf(between_days));           
    }   
    /**
     * 比较两个日期， 若date1=date2 ，返回true
     * throws ParseException
     */
    public static boolean compareDateScope(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date start = sdf.parse(date1);
        Date end = sdf.parse(date2);
        long c = end.getTime() - start.getTime();
        boolean flag = false;
        if(Integer.parseInt(String.valueOf(c)) == 0){
        	return true;
        }
        return flag;
    }
    
    /**
     * 判断一个日期是不是当前月份的最后一天
     * @param date 
     * @return true:是 ，false:不是
     */
    public static boolean isLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    } 
    
    /**
     * 通过年月日获得当前期数的最后一天
     * @param year
     * @param month
     * @return
     */
    public static String getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
        return new SimpleDateFormat("yyyyMMdd ").format(cal.getTime());
    } 
    
    /**
     * 根据日期求取日期的最后一个日子
     * @param reqTime 日期字符串 格式 yyyyMMdd
     * @return
     */
    public static String getLastDayofMonth(String reqTime){
        if(StringUtils.isBlank(reqTime)||reqTime.length() < 6) {
            return null;
        }else{
            int year = Integer.parseInt(reqTime.substring(0, 4));
            int month = Integer.parseInt(reqTime.substring(4, 6));
            return getLastDayOfMonth(year, month);
        }
    }
    /**
      * 当前日期加上天数后的日期
      * @param num 为增加的天数
      * @return
      */
     public static String plusDay(int num){
         Date d = new Date();
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String currdate = format.format(d);
         System.out.println("现在的日期是：" + currdate);
         Calendar ca = Calendar.getInstance();
         ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
         d = ca.getTime();
         String enddate = format.format(d);
         System.out.println("增加天数以后的日期：" + enddate);
         return enddate;
     }
    
    /**
     * 根据日期获取日期是星期几
     * @param date
     * @return
     */
    public static String getWeekOfDate(Date date) {
		String weekDay ="";
    	if(!isEmpty(date)){
			String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
			if (w < 0)
				w = 0;
			weekDay=  weekDays[w];
		}
		return weekDay;
    }
    
    
    /**
     * 日期转换成汉字
     * @param date  YYYYMMdd***
     * @return
     */
    public static String getDateHanzi(String date) {
    	String dataV = "";
    	if(!isEmpty(date)&&date.length()>=8){
    		dataV = date.substring(0,4) + "年" +date.substring(4,6) +"月"+ date.substring(6,8) + "日";
		} 
    	return dataV;
    }
    
    
    /**
     * 日期转换成汉字
     * @param date  HHmm
     * @return
     */
    public static String getDateMinite(String date) {
    	String dataV = "";
    	if(!isEmpty(date)&&date.length()>=4){
    		Integer houe = Integer.parseInt(date.substring(0,2));
    		Integer minute = Integer.parseInt(date.substring(2,4));
    		if(houe>12){
    			dataV = "下午" + (houe-12)+":" + date.substring(2,4);
    		}
    		if(houe==12&&minute>0){
    			dataV = "下午" + houe +":" + minute;
    		}
    		if(houe==12&&minute==0){
    			dataV = "中午" + houe +":" + date.substring(2,4);
    		}
    		if(houe <12){
    			dataV = "上午" + houe + ":" + date.substring(2,4);
    		}
		} 
    	return dataV;
    }

    /**
     * 将字符串指定长度后面补0
     * @param str
     * @param strLength
     * @return
     */
    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        StringBuffer sb = null;
        while (strLen < strLength) {
            sb = new StringBuffer();
            // sb.append("0").append(str);// 左补0
            sb.append(str).append("0");// 右补0
            str = sb.toString();
            strLen = str.length();
        }
        return str;
    }
    /**
     * 比较两个日期的大小，第一个大或相等返回true 第二个大返回false
     * @param dt1
     * @param dt2
     * @return
     */
    public static boolean dateComparison(String dt1,String dt2){
        Date nowDate = JavaUtil.StringToDate(dt1, "yyyMMdd");
        Date strDate = JavaUtil.StringToDate(dt2, "yyyMMdd");
        if (nowDate.getTime() > strDate.getTime()) {
           System.out.println("dt1 在dt2前");
           return false;
        } else if(nowDate.getTime() < strDate.getTime()) {
           System.out.println("dt1在dt2后");
           return true;
        }else if(nowDate.getTime() == strDate.getTime()) {
            System.out.println("dt1==dt2");
            return true;
         }
        return false;
    }
    
    /**
     * 日期转换成 几月几   如果是 今天 返回  今天 ，昨天 返回 昨天
     * @param createtime
     * @return
     * @throws Exception
     */
	public static String getday(String createtime) throws Exception {
		
		Date date = StringToDate(createtime, "yyyyMMddHHmmss");
		//日期转换成 几月几
		String dayInfo = Integer.parseInt(createtime.substring(4, 6))+"月"+Integer.parseInt(createtime.substring(6, 8));
		int days = getDaysBetween(date,new Date()); 
		switch (days) {
			case 0:
				dayInfo = "今天";
				break;
			case 1:
				dayInfo = "昨天";
				break;
			default:
				break;
		}
		
		return dayInfo;
	}
	
	/**
     * 获取移除末尾展位0的岗位编码
     *
     * @param postNo 全长度岗位编码
     * @return 短岗位编码
     */
    public static String getShortPostNo(String postNo) {
        while (postNo.endsWith("00")) {
            postNo = postNo.substring(0, postNo.length() - 2);
        }
        return postNo;
    }
//    /**
//     * 获取session中的用户标识，获取不到默认系统自动
//     * <p>
//     * throws Exception
//     */
//    public static String getUserType() throws Exception {
//        String userType;
//        try {
//            userType = SessionUtil.getCurrentUser() == null ? null : SessionUtil.getCurrentUser().getUserType();
//        } catch (Exception e) {
//            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "获取session中操作员编号出错", LogUtil.EMPTY, e);
//        }
//        return userType;
//    }
    
    /**
     * 获取姓名称呼
     *
     * @param sex 编号 0：女，1：男
     * @return
     */
    public static String getSexKey(String sex) {
        String call = "";
        switch (sex) {
            case "男":
                call = "1";
                break;
            case "女":
                call = "0";
                break;
            default:
                call = "";
                break;
        }
        return call;
    }

    /**
     * '01：企业主，02：上班',
     * @param trim
     * @return
     */
    public static String getWorkStateKey(String trim) {
        String call = "";
        switch (trim) {
            case "企业主":
                call = "01";
                break;
            case "上班":
                call = "02";
                break;
            default:
                call = "";
                break;
        }
        return call;
       
    }
    /**
     * '婚姻状况 10未婚， 21，已婚，22离异，30丧偶',
     * @param trim
     * @return
     */
    public static String getMarriageStateKey(String trim) {
        String call = "";
        switch (trim) {
            case "未婚":
                call = "10";
                break;
            case "已婚":
                call = "21";
                break;
            case "离异":
                call = "22";
                break;
            case "丧偶":
                call = "30";
                break;
            default:
                call = "";
                break;
        }
        return call;
    }
    
    /**
     * 返回字符串的TRIM值
     * @param str
     * @return
     */
    public static String getStrTirm(String str) {
        return str.replace("-", "").replace(":", "").replace("：", "").replace(" ", "").trim();
    }
    
    /**
     * HH:MM:ss  时分秒转秒数
//     * @param str
     * @return
     */
//    public static String sumSecond(String second) {
//    	if(StringUtils.isBlank(second)){
//    		return "";
//    	}
//		second=second.replaceAll(":", "");
//		int sum=0;
//		String shi = second.substring(0,2);
//
//		String fen = second.substring(2,4);
//		String miao = second.substring(4,6);
//		sum=Integer.parseInt(shi)*60*60+Integer.parseInt(fen)*60+Integer.parseInt(miao);
//		System.out.println(sum+"   "+shi+"  "+fen+"   "+miao);
//		return sum+"";
//	}
    
    /**
     * 把格式是yyyy/mm/dd或yyyy-mm-dd或yyyy.mm.dd
     * 或yyyy/m/d或yyyy-m-d或yyyy.m.d
     * 转化成yyyymmdd
     *
     * @return yyyymmdd
     * throws Exception
     */
//    public static String changeNow(String str) throws Exception {
//        try {
//        	String result=null;
//        	String year = null;
//        	String month = null;
//        	String day = null;
//        	if(str.contains("-")){
//        		String [] strs = str.split("\\-");
//        		year = strs[0];
//        		month = strs[1];
//        		day = strs[2];
//        	}else if(str.contains("/")){
//        		String [] strs = str.split("\\/");
//        		year = strs[0];
//        		month = strs[1];
//        		day = strs[2];
//        	}else if(str.contains(".")){
//        		String [] strs = str.split("\\.");
//        		year = strs[0];
//        		month = strs[1];
//        		day = strs[2];
//        	}else {
//        		return str;
//        	}
//        	int da = Integer.valueOf(day);
//        	if(da < 10) {
//        		day = "0"+String.valueOf(da);;
//        	}
//        	int mon = Integer.valueOf(month);
//        	if(mon < 10) {
//        		month = "0"+String.valueOf(mon);
//        	}
//        	result = year + month + day;
//            return result;
//        } catch (Exception e) {
////            throw LogUtil.handerEx(CommonErrorCode.PUB_JAVA_UTIL, "日期格式转换成字符串失败", LogUtil.EMPTY, e);
//            throw e;
//        }
//    }
    
    /**
     * 获取连个时间相差秒数
     * @param beginTime
     * @param endTime
     * @return
     */
//    public static String secondsOfDate(String beginTime,String endTime){
//    	Date begin = JavaUtil.StringToDate(beginTime, "yyyyMMddhhmmss");
//		Date end = JavaUtil.StringToDate(endTime, "yyyyMMddhhmmss");
//		long number = end.getTime()-begin.getTime();
//		String longTimeToDay = longTimeToDay(number);
//		return longTimeToDay;
//    }
    /**
     * 根据long类型的毫秒数返回秒数
     * @param ms
     * @return
     */
//    public static String longTimeToDay(Long ms){
//        Integer ss = 1000;
//        Integer mi = ss * 60;
//        Integer hh = mi * 60;
//        Integer dd = hh * 24;
//
//        Long day = ms / dd;
//        Long hour = (ms - day * dd) / hh;
//        Long minute = (ms - day * dd - hour * hh) / mi;
//        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
//        Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;
//
//        long sb =0;
//        if(day > 0) {
//        	sb +=  day*24*60*60;
//        }
//        if(hour > 0) {
//        	sb +=  hour*60*60;
//        }
//        if(minute > 0) {
//        	sb += minute*60;
//        }
//        if(second > 0) {
//        	sb += second;
//        }
//        if(milliSecond > 0) {
//        	sb += milliSecond/1000;
//        }
//        return String.valueOf(sb);
//    }
    
    /**
          *   通过时间计算两个日期贱的天数
     * @param begin
     * @param end
     * @return
     */
//    public static int getDayByTime(Date begin,Date end) {
//			long i =  (((begin.getTime() - end.getTime())/(24*60*60*1000)));
//			int days = Integer.valueOf(String.valueOf(i));
//			return Math.abs(days);
//    }
    
}
