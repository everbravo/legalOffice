<?php
    $remitente = @$_POST["Nombres"];
    $asunto = @$_POST["Asunto"];
    $emailSujeto = @$_POST["Email"];
    $cuerpoMSG = @$_POST["mensaje"];
    static $destinatario = "alexbraver333@gmail.com";
    static $fecha = array localtime ([ int $timestamp = time() [, bool $is_associative = false ]] );
    $contenido = "Nombre: ". $remitente . "\nFecha: ".$fecha . "\nCorreo: " . $emailSujeto . "\nMensaje:  " . $cuerpoMSG;
    $resp = mail($destinatario, $asunto, $contenido);
    if($resp = true){
        $msg='mensaje enviado satisfactoriamente';
        header("Location: ../index.html?msg=$msg");
    }else{
        $msg='ocurrio un error al tratar de enviar su mensaje, por favor intentelo nuevamente';
        header("Location: ../index.html?msg=$msg");
    }
?>