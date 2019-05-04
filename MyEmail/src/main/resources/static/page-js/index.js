function get()
{
    $.get("/test", $('#my_form').serialize(),   function (data, textStatus)
                                                {
                                                    alert(data);
                                                }
         );
}

$(  function()
    {
        $("#commit").click(get);
    }
);

