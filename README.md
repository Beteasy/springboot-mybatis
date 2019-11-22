## 使用步骤

### 更改数据源连接 
    配置在application.yml文件里
### 创建对应表与填充数据 
  创建department表、employee表与填充数据文件在resource/sql目录里
###  测试模拟
      暴露了两个控制器对应department和employee
      对应请求/department和/employee 端口为8080
      接口采用restfull 风格 
      post对应新增 
      put对应修改 
      delete方法对应删除
      get 对应列表 具体参数可查看控制器
      
    
    