# examples

**examples** 为多个项目的业务逻辑,常用技术等进行汇总的一个新项目;开始时间为2021/05/21;
- --
## 万达电影 

+ 影院的核心有几个点:
    + 对接火凤凰影院/pos/
    + 下单时进行座位预锁定; 定时解除未支付订单,释放座位; 下新订单时自动解除旧订单,并释放其锁定座位;
    + 退票时,退款,退卡卷权益,解除座位;改订单状态;

+ 电影系统
    + 查询电影
        + 查询电影详情
        + 查询影评
        + 查询演员
        + 查询图集
        + 查询票房
        + 预告片 
            + 预告片管理 压缩过的小视频, 上映期间全部缓存;
        + 相关电影推荐
        + 电影资讯
        + 查询排期

+ 影院系统
    + 查询影院
        + 查询影厅
        + 查询场次
        + 选座购票
            + 座位查询
            + 创建订单 - 选座预定 (预锁定)  - 跳转到支付页面
               + {"count":2,"list":[{"rowId":2,"columnId":2,"seatNo":"11071161#05#04","type":"N"},{"rowId":2,"columnId":1,"seatNo":"11071161#05#03","type":"N"}]}
               + sectionId=1&sectionName=5&seqNo=202105210423858&seats=%7B%22count%22%3A2%2C%22list%22%3A%5B%7B%22rowId%22%3A2%2C%22columnId%22%3A2%2C%22seatNo%22%3A%2211071161%2305%2304%22%2C%22type%22%3A%22N%22%7D%2C%7B%22rowId%22%3A2%2C%22columnId%22%3A1%2C%22seatNo%22%3A%2211071161%2305%2303%22%2C%22type%22%3A%22N%22%7D%5D%7D
            + 支付订单
                + 支付订单前可选择使用优惠卷 / 卡 有冲突有不冲突 重新计算价钱
                + 支付成功后要把卡/卷的权益使用掉;
            + 解锁座位
            + 锁定座位
    

  
+ 用户系统
    + 用户注册
    + 用户登录
    + 想看电影查询
    + 评分历史查询

+ 订单系统
    + 历史订单
    + 新订单
    + 订单详情查询

+ 支付系统
    + 订单支付
    + 对接其他支付平台
    
+ 活动系统
    + 秒杀优惠卷 参考秒杀项目

+ 优惠卷管理
    + 创建优惠卷
    + 优惠卷赠送
    + 优惠卷使用

+ 卡管理
    + 储值卡等管理/使用
    + 年卡优惠折扣

- --