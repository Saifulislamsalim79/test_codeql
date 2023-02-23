package io.intercom.android.sdk.helpcenter;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
/* loaded from: classes2.dex */
class HelpCenterWebViewClient extends WebViewClient {
    private final Map<String, String> headers;
    private final String helpCenterHost;
    private final HelpCenterListener helpCenterListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HelpCenterWebViewClient(String str, Map<String, String> map, HelpCenterListener helpCenterListener) {
        this.helpCenterHost = str;
        this.helpCenterListener = helpCenterListener;
        this.headers = map;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.helpCenterListener.onWebViewFinishedLoad();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (!TextUtils.isEmpty(this.helpCenterHost) && this.helpCenterHost.equals(host)) {
            webView.loadUrl(str, this.headers);
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
