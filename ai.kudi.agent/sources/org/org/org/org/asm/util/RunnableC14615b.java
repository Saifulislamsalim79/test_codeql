package org.org.org.org.asm.util;

import android.graphics.Point;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.concurrent.CountDownLatch;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* renamed from: org.org.org.org.asm.util.b */
/* loaded from: classes.dex */
public final class RunnableC14615b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C11812w f32395a;

    /* renamed from: h */
    public final /* synthetic */ CountDownLatch f32396h;
    public final /* synthetic */ WebView this$0;

    public RunnableC14615b(WebView webView, CountDownLatch countDownLatch, C11812w c11812w) {
        this.this$0 = webView;
        this.f32396h = countDownLatch;
        this.f32395a = c11812w;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Runnable
    public final void run() {
        WebView $r2 = this.this$0;
        WebSettings $r3 = $r2.getSettings();
        Log_OC.loadImage($r3, "this.settings");
        boolean $z0 = $r3.getJavaScriptEnabled();
        if ($z0) {
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 19) {
                org.org.org.org.asm.Type $r4 = org.org.org.org.asm.Type.f32312c;
                WebView $r22 = this.this$0;
                Point $r5 = $r4.set($r22);
                WebView $r23 = this.this$0;
                int $i02 = $r23.getScrollX();
                int $i1 = $r5.x;
                final int $i03 = (-$i02) + $i1;
                final int $i12 = $r5.y;
                WebView $r24 = this.this$0;
                try {
                    $r24.evaluateJavascript("var rectanglesToOverlay = [];\nvar elementsToHide = document.querySelectorAll('.smartlook-hide,input:not([type=\"button\"]):not([type=\"submit\"]):not(.smartlook-show)');\ntry { [].forEach.call(elementsToHide, function (elem, index) {\n    var rect = elem.getBoundingClientRect();\n    rectanglesToOverlay.push([rect.left, rect.top, rect.width, rect.height]);\n}) } catch (e) { console.log(e) };\nrectanglesToOverlay;", new ValueCallback<String>() { // from class: org.org.org.org.asm.util.m$b$a
                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        /* JADX WARN: Incorrect condition in loop: B:10:0x0066 */
                        /* JADX WARN: Incorrect condition in loop: B:16:0x0086 */
                        /* JADX WARN: Incorrect condition in loop: B:28:0x0143 */
                        /* JADX WARN: Incorrect condition in loop: B:32:0x0176 */
                        /* JADX WARN: Incorrect condition in loop: B:36:0x01ae */
                        /* JADX WARN: Type inference failed for: r17v2, types: [T, java.util.Collection, java.util.ArrayList] */
                        /* renamed from: a */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void m1026a(java.lang.String r47) {
                            /*
                                Method dump skipped, instructions count: 485
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.m$b$a.m1026a(java.lang.String):void");
                        }

                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
                            String $r25 = str;
                            m1026a($r25);
                        }
                    });
                    return;
                } catch (Exception $r7) {
                    System $r8 = System.f32375c;
                    LogAspect $r9 = LogAspect.BLACKLISTING;
                    LogSeverity $r10 = LogSeverity.WARN;
                    TopLevel$NativeErrors $r11 = $r8.get($r9, true, $r10);
                    int $i04 = $r11.ordinal();
                    if ($i04 == 0) {
                        StringBuilder $r12 = new StringBuilder();
                        StringBuilder $r1 = new StringBuilder();
                        $r1.append("sensitiveWebViewRectangles() failed: exception = ");
                        String $r13 = Log.get($r7, false, 2, null);
                        $r1.append($r13);
                        String $r132 = $r1.toString();
                        $r12.append($r132);
                        $r12.append(", [logAspect: ");
                        $r12.append($r9);
                        $r12.append(']');
                        String $r133 = $r12.toString();
                        $r8.size($r9, $r10, "WebViewExtensions", $r133);
                    }
                    CountDownLatch $r14 = this.f32396h;
                    $r14.countDown();
                    return;
                }
            }
        }
        CountDownLatch $r142 = this.f32396h;
        $r142.countDown();
    }
}
