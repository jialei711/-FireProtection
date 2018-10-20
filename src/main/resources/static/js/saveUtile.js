/**
 * Created by binbin on 2018/4/24.
 */
//写入localStorage
function setLocalStorage(name, value)
{
    window.localStorage.setItem(name, value);
}

//读取localStorage
function getLocalStorage(name)
{
    return window.localStorage.getItem(name);
}

//处理URL后面挂的参数，APPCAN不支持直接通过js去参数
function getQuery(name, infor) {

    var paras = infor.split('&');
    for(var i=0; i<paras.length; i++){
        var item = paras[i];
        var value = item.split('=');
        if(value[0] == name){
            return value[1];
        }
    }
    return null;
}
