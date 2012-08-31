var app = (function(){
    
    var events = new Object();
    var methods = new Object();
    
    
    
    methods.login = function()
    {
      var json = { username : $("#t_username").val() , password : $("#t_password").val()};
      $.post("/login/authenticate",json,function(data){
          
      });
      
      
    };
    
    
    return {methods : methods};
})();