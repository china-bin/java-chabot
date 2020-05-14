$("#file-upload").on("change", function(e){
    console.log(e);
    var file = this.files[0];
    console.log(this.files.length);
    var img = document.createElement("img");
    img.height="120";
    img.width="120";
    img.style.position="absolute";
    img.style.zIndex="9"
    // img.file = file;
    $(".fileinput-button").append(img);
    var reader = new FileReader();
    reader.onload = function(e){
        console.log(e);
        $.operate.jsonPostUploadIMG("/upload", file, function (res) {
            if (res.code == 200) {
                console.log("上传成功:" + JSON.stringify(res))
                var nameValue = $(".fileinput-button input").prop("name")
                $(".fileinput-button input").remove()
                var input = document.createElement("input")
                input.type="hidden"
                input.name=nameValue
                input.value=res.data
                $(".fileinput-button").append(input);

                img.src = e.target.result;
            } else {

            }

        })

    };
    reader.readAsDataURL(file);
});