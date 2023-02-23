package io.intercom.android.sdk.sheets;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes3.dex */
class SheetWebViewClient extends WebViewClient {
    private final SheetListener sheetListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SheetWebViewClient(SheetListener sheetListener) {
        this.sheetListener = sheetListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.sheetListener.onWebViewFinishedLoad();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!scheme.equals("http") && !scheme.equals("https")) {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
            return true;
        }
        webView.loadUrl(str);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
