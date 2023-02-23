package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.IBinder;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import io.intercom.android.sdk.C10110R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes.dex */
class MessengerCardAlertDialogBuilder extends DialogInterfaceC0936d.C0937a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessengerCardAlertDialogBuilder(Context context, Map map, int i, WebView webView) {
        super(context);
        setUp(context, map, i, webView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUp(Context context, final Map map, int i, final WebView webView) {
        LayoutInflater $r4 = LayoutInflater.from(context);
        int $i1 = C10110R.C10113layout.intercom_webview_card_input;
        View $r5 = $r4.inflate($i1, (ViewGroup) null, false);
        Object $r6 = map.get("label");
        CharSequence $r7 = (CharSequence) $r6;
        setTitle($r7);
        int $i12 = C10110R.C10112id.input;
        View $r8 = $r5.findViewById($i12);
        final AutoCompleteTextView $r9 = (AutoCompleteTextView) $r8;
        Object $r62 = map.get("currentValue");
        CharSequence $r72 = (CharSequence) $r62;
        $r9.setText($r72);
        Object $r63 = map.get("placeholder");
        CharSequence $r73 = (CharSequence) $r63;
        $r9.setHint($r73);
        ColorStateList $r10 = ColorStateList.valueOf(i);
        C7759x.m17490t0($r9, $r10);
        setView($r5);
        setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                MessengerCardAlertDialogBuilder $r3 = MessengerCardAlertDialogBuilder.this;
                WebView $r42 = webView;
                AutoCompleteTextView $r52 = $r9;
                Editable $r64 = $r52.getText();
                String $r74 = $r64.toString();
                Map $r2 = map;
                $r3.sendResultToWebview($r42, $r74, $r2);
                AutoCompleteTextView $r53 = $r9;
                Context $r82 = $r53.getContext();
                Object $r92 = $r82.getSystemService("input_method");
                InputMethodManager $r102 = (InputMethodManager) $r92;
                AutoCompleteTextView $r54 = $r9;
                IBinder $r11 = $r54.getWindowToken();
                $r102.hideSoftInputFromWindow($r11, 0);
                dialogInterface.dismiss();
            }
        });
        setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                AutoCompleteTextView $r2 = $r9;
                Context $r3 = $r2.getContext();
                Object $r42 = $r3.getSystemService("input_method");
                InputMethodManager $r52 = (InputMethodManager) $r42;
                AutoCompleteTextView $r22 = $r9;
                IBinder $r64 = $r22.getWindowToken();
                $r52.hideSoftInputFromWindow($r64, 0);
                dialogInterface.cancel();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void sendResultToWebview(WebView webView, String str, Map map) {
        String $r2;
        try {
            String $r22 = URLEncoder.encode(str, "UTF-8");
            $r2 = $r22.replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException $r4) {
            $r4.printStackTrace();
            $r2 = "";
        }
        StringBuilder $r5 = new StringBuilder();
        $r5.append("window.fallbackApp.bridgeEvent('UPDATE_TEXT', { value:'");
        $r5.append($r2);
        $r5.append("', id:'");
        Object $r6 = map.get("id");
        $r5.append($r6);
        $r5.append("'})");
        String $r23 = $r5.toString();
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 19) {
            webView.evaluateJavascript($r23, null);
            return;
        }
        webView.loadUrl("javascript:" + $r23);
    }
}
