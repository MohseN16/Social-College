var app = (function(){
    
    var events = new Object();
    var methods = new Object();
    
    
    
    methods.login = function()
    {
      var data = { username : $("#t_username").val() , password : $("#t_password").val()};
      $.post("/login/authenticate/",data,function(data){
          
      });
      
    };
    
    
    
})();