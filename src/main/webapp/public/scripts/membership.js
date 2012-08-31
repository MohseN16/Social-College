var app = (function(){
    
    var events = new Object();
    var methods = new Object();
    
    
    
    methods.login = function()
    {
        var json = 
        {
            username : $("#t_username").val() , 
            password : $("#t_password").val()
        };
        $.post("/login/authenticate",json,function(data){
                 if (data.result == 1)
            {
                window.location = "/dashboard/"
            }
            else
            {
                $("#login-msg").html(data.message);
                $("#login-msg").addClass("alert-box "  + data.type);
                $("#login-panel").addClass("animated wobble");
            }
        });
      
      
    };
    
    
    return {
        methods : methods
    };
})();