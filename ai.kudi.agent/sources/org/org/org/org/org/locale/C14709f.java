package org.org.org.org.org.locale;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.segment.analytics.Middleware;
import com.smartlook.sdk.smartlook.SetupOptions;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.api.model.LogListener;
import com.smartlook.sdk.smartlook.core.bridge.BridgeInterface;
import com.smartlook.sdk.smartlook.core.session.model.UserProperties;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMask;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.SmartlookSensitivity;
import com.smartlook.sdk.smartlook.integration.IntegrationListener;
import com.smartlook.sdk.smartlook.integration.model.Integration;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.List;
import java.util.Set;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import org.json.JSONObject;
import org.org.org.org.app.C14581f;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.parser.Attribute;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.C14705f;
import org.org.org.org.org.asm.C14635f;
import org.org.org.org.org.common.Buffer;
import org.org.org.org.org.common.C14642f;
import org.org.org.org.org.common.Logger;
import org.org.org.org.org.core.base.C14665f;
import org.org.org.org.org.jraf.Label;
import org.org.org.org.org.nonstiff.C14717b;
import org.org.org.org.org.util.BigReal;
/* renamed from: org.org.org.org.org.locale.f */
/* loaded from: classes.dex */
public final class C14709f {

    /* renamed from: c */
    public static final Log f32834c;

    /* renamed from: s */
    public static boolean f32835s;

    /* renamed from: a */
    public final Buffer f32836a;

    /* renamed from: b */
    public final C14581f f32837b;

    /* renamed from: d */
    public final C14642f f32838d;

    /* renamed from: f */
    public final Logger f32839f;

    /* renamed from: i */
    public final Label f32840i;

    /* renamed from: k */
    public final org.org.org.org.app.p597ui.Label f32841k;

    /* renamed from: l */
    public final org.org.org.org.android.model.Log f32842l;

    /* renamed from: o */
    public final C14665f f32843o;

    /* renamed from: p */
    public final BigReal f32844p;

    /* renamed from: r */
    public final org.org.org.org.org.data.Label f32845r;

    /* renamed from: u */
    public final C14717b f32846u;

    /* renamed from: w */
    public final C14635f f32847w;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Log $r0 = new Log(null);
        f32834c = $r0;
    }

    public C14709f(C14635f c14635f, org.org.org.org.android.model.Log log, Buffer buffer, C14642f c14642f, C14581f c14581f, Logger logger, org.org.org.org.app.p597ui.Label label, C14665f c14665f, org.org.org.org.org.data.Label label2, C14717b c14717b, BigReal bigReal, Label label3) {
        Log_OC.getArray(c14635f, "sdkLifecycleHandler");
        Log_OC.getArray(log, "tracker");
        Log_OC.getArray(buffer, "sessionHandler");
        Log_OC.getArray(c14642f, "identifyHandler");
        Log_OC.getArray(c14581f, "autoIntegrationHandler");
        Log_OC.getArray(logger, "sessionEventHandler");
        Log_OC.getArray(label, "segmentIntegrationHandler");
        Log_OC.getArray(c14665f, "sensitivityHandler");
        Log_OC.getArray(label2, "configurationHandler");
        Log_OC.getArray(c14717b, "referrerHandler");
        Log_OC.getArray(bigReal, "consistencyHandler");
        Log_OC.getArray(label3, "bridgeInterfaceHandler");
        this.f32847w = c14635f;
        this.f32842l = log;
        this.f32836a = buffer;
        this.f32838d = c14642f;
        this.f32837b = c14581f;
        this.f32839f = logger;
        this.f32841k = label;
        this.f32843o = c14665f;
        this.f32845r = label2;
        this.f32846u = c14717b;
        this.f32844p = bigReal;
        this.f32840i = label3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m631a(C14709f c14709f, List list, LogSeverity $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = LogSeverity.VERBOSE;
        }
        c14709f.m632a(list, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean get(String str) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            System $r4 = System.f32375c;
            LogAspect $r1 = LogAspect.MANDATORY;
            LogSeverity $r2 = LogSeverity.WARN;
            TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
            int $i0 = $r5.ordinal();
            if ($i0 != 0) {
                return false;
            }
            String $r3 = "Smartlook api key cannot be empty!, [logAspect: " + $r1 + ']';
            $r4.size($r1, $r2, "Smartlook", $r3);
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final SmartlookSensitivity m636a(View view) {
        Log_OC.getArray(view, "view");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r1 = $r3.add(view);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final List m637a() {
        List $r5;
        List $r52;
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            $r5 = $r4.m737c();
        } else {
            System $r6 = System.f32375c;
            LogAspect $r1 = LogAspect.MANDATORY;
            LogSeverity $r2 = LogSeverity.WARN;
            TopLevel$NativeErrors $r7 = $r6.get($r1, false, $r2);
            int $i0 = $r7.ordinal();
            if ($i0 == 0) {
                StringBuilder $r8 = new StringBuilder();
                String $r10 = "currentEventTrackingModes() cannot be called before SDK setup!";
                $r8.append($r10);
                $r8.append(", [logAspect: ");
                $r8.append($r1);
                $r8.append(']');
                String $r102 = $r8.toString();
                $r6.size($r1, $r2, "Smartlook", $r102);
            }
            $r5 = null;
        }
        if ($r5 != null) {
            return $r5;
        }
        $r52 = C13726r.m3891e();
        return $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:31:0x0025 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m635a(java.lang.String r19) {
        /*
            r18 = this;
            java.lang.String r1 = "eventTrackingModes"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            org.json.JSONArray r2 = new org.json.JSONArray
            r0 = r19
            r2.<init>(r0)     // Catch: org.json.JSONException -> L81
            java.util.List r3 = org.org.org.org.asm.util.Collection.m1057a(r2)     // Catch: org.json.JSONException -> L81
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)     // Catch: org.json.JSONException -> L81
            r4.<init>(r5)     // Catch: org.json.JSONException -> L81
            java.util.Iterator r7 = r3.iterator()     // Catch: org.json.JSONException -> L81
        L21:
            boolean r8 = r7.hasNext()     // Catch: org.json.JSONException -> L81
            if (r8 == 0) goto L3a
            java.lang.Object r9 = r7.next()     // Catch: org.json.JSONException -> L81
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r19 = r10
            r0 = r19
            com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode r11 = com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode.valueOf(r0)     // Catch: org.json.JSONException -> L81
            r4.add(r11)     // Catch: org.json.JSONException -> L81
            goto L21
        L3a:
            r0 = r18
            r0.m590e(r4)     // Catch: org.json.JSONException -> L81
            return
        L40:
            org.org.org.org.asm.parser.System r12 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r13 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.MANDATORY
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r14 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.WARN
            r6 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r15 = r12.get(r13, r6, r14)
            int r5 = r15.ordinal()
            if (r5 == 0) goto L52
            return
        L52:
            java.lang.StringBuilder r16 = new java.lang.StringBuilder
            r0 = r16
            r0.<init>()
            java.lang.String r1 = "setEventTrackingModes() json serialization failed!"
            r0 = r16
            r0.append(r1)
            java.lang.String r1 = ", [logAspect: "
            r0 = r16
            r0.append(r1)
            r0 = r16
            r0.append(r13)
            r6 = 93
            r0 = r16
            r0.append(r6)
            r0 = r16
            java.lang.String r19 = r0.toString()
            java.lang.String r1 = "Smartlook"
            r0 = r19
            r12.size(r13, r14, r1, r0)
            return
        L81:
            r17 = move-exception
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.locale.C14709f.m635a(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m634a(String str, String str2) {
        Log_OC.getArray(str, "referrer");
        Log_OC.getArray(str2, TransactionField.TRANSACTION_CHANNEL);
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14717b $r4 = this.f32846u;
            $r4.m539a(str, str2);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "setReferrerInfo() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m633a(List list) {
        Log_OC.getArray(list, "views");
        C14665f $r4 = this.f32843o;
        SmartlookSensitivity $r1 = SmartlookSensitivity.EXPLICITLY_SENSITIVE;
        View[] $r5 = new View[0];
        Object[] $r2 = list.toArray($r5);
        if ($r2 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r6;
        }
        View[] $r52 = (View[]) $r2;
        $r4.m855a($r1, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m632a(List list, LogSeverity logSeverity) {
        List $r2;
        Set $r4;
        Log_OC.getArray(list, "aspects");
        Log_OC.getArray(logSeverity, "minimalSeverity");
        System $r3 = System.f32375c;
        $r2 = C13742z.m3813K(list);
        $r4 = C13742z.m3822E0($r2);
        $r3.read($r4, logSeverity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RenderingMode add() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            RenderingMode $r5 = $r4.reset();
            return $r5;
        }
        System $r6 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r6.get($r1, false, $r2);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "currentRenderingMode() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r1);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r6.size($r1, $r2, "Smartlook", $r102);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:31:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(java.lang.String r20) {
        /*
            r19 = this;
            java.lang.String r1 = "loggingAspects"
            r0 = r20
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            org.json.JSONArray r2 = new org.json.JSONArray
            r0 = r20
            r2.<init>(r0)     // Catch: org.json.JSONException -> L8a
            java.util.List r3 = org.org.org.org.asm.util.Collection.m1057a(r2)     // Catch: org.json.JSONException -> L8a
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)     // Catch: org.json.JSONException -> L8a
            r4.<init>(r5)     // Catch: org.json.JSONException -> L8a
            java.util.Iterator r7 = r3.iterator()     // Catch: org.json.JSONException -> L8a
        L21:
            boolean r8 = r7.hasNext()     // Catch: org.json.JSONException -> L8a
            if (r8 == 0) goto L3a
            java.lang.Object r9 = r7.next()     // Catch: org.json.JSONException -> L8a
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r20 = r10
            r0 = r20
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r11 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.valueOf(r0)     // Catch: org.json.JSONException -> L8a
            r4.add(r11)     // Catch: org.json.JSONException -> L8a
            goto L21
        L3a:
            java.util.List r3 = kotlin.p557z.C13722p.m3970D0(r4)     // Catch: org.json.JSONException -> L8a
            r12 = 0
            r6 = 2
            r13 = 0
            r0 = r19
            m631a(r0, r3, r12, r6, r13)     // Catch: org.json.JSONException -> L8a
            return
        L47:
            org.org.org.org.asm.parser.System r14 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r11 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.MANDATORY
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r15 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.WARN
            r6 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r16 = r14.get(r11, r6, r15)
            r0 = r16
            int r5 = r0.ordinal()
            if (r5 == 0) goto L5b
            return
        L5b:
            java.lang.StringBuilder r17 = new java.lang.StringBuilder
            r0 = r17
            r0.<init>()
            java.lang.String r1 = "enableBridgeLoggingAspects() json serialization failed!"
            r0 = r17
            r0.append(r1)
            java.lang.String r1 = ", [logAspect: "
            r0 = r17
            r0.append(r1)
            r0 = r17
            r0.append(r11)
            r6 = 93
            r0 = r17
            r0.append(r6)
            r0 = r17
            java.lang.String r20 = r0.toString()
            java.lang.String r1 = "Smartlook"
            r0 = r20
            r14.size(r11, r15, r1, r0)
            return
        L8a:
            r18 = move-exception
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.locale.C14709f.add(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, Bundle bundle) {
        Log_OC.getArray(str, "eventName");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.add(str, bundle);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "trackCustomEvent() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, ViewType viewType, ViewState viewState) {
        Log_OC.getArray(str, "name");
        Log_OC.getArray(viewType, "viewType");
        Log_OC.getArray(viewState, "viewState");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            Logger $r5 = this.f32839f;
            $r5.add(str, viewType, viewState, true);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r8 = LogSeverity.WARN;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        int $i0 = $r9.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r10 = new StringBuilder();
        String $r1 = "trackNavigationEvent() cannot be called before SDK setup!";
        $r10.append($r1);
        $r10.append(", [logAspect: ");
        $r10.append($r7);
        $r10.append(']');
        String $r12 = $r10.toString();
        $r6.size($r7, $r8, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2) {
        Log_OC.getArray(str, "eventName");
        Log_OC.getArray(str2, "eventProperties");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            try {
                JSONObject $r6 = new JSONObject(str2);
                $r5.add(str, $r6);
                return;
            } catch (Exception e) {
                System $r7 = System.f32375c;
                LogAspect $r8 = LogAspect.MANDATORY;
                LogSeverity $r9 = LogSeverity.WARN;
                TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
                int $i0 = $r10.ordinal();
                if ($i0 != 0) {
                    return;
                }
                String $r2 = "trackCustomEvent() json serialization failed!, [logAspect: " + $r8 + ']';
                $r7.size($r8, $r9, "Smartlook", $r2);
                return;
            }
        }
        System $r72 = System.f32375c;
        LogAspect $r82 = LogAspect.MANDATORY;
        LogSeverity $r92 = LogSeverity.WARN;
        TopLevel$NativeErrors $r102 = $r72.get($r82, false, $r92);
        int $i02 = $r102.ordinal();
        if ($i02 != 0) {
            return;
        }
        StringBuilder $r11 = new StringBuilder();
        String $r22 = "trackCustomEvent() cannot be called before SDK setup!";
        $r11.append($r22);
        $r11.append(", [logAspect: ");
        $r11.append($r82);
        $r11.append(']');
        String $r23 = $r11.toString();
        $r72.size($r82, $r92, "Smartlook", $r23);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2, String str3) {
        Log_OC.getArray(str, "eventName");
        Log_OC.getArray(str2, "key");
        Log_OC.getArray(str3, "value");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            JSONObject $r6 = new JSONObject();
            $r6.put(str2, str3);
            $r5.add(str, $r6);
            return;
        }
        System $r7 = System.f32375c;
        LogAspect $r8 = LogAspect.MANDATORY;
        LogSeverity $r9 = LogSeverity.WARN;
        TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
        int $i0 = $r10.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r11 = new StringBuilder();
        String $r1 = "trackCustomEvent() cannot be called before SDK setup!";
        $r11.append($r1);
        $r11.append(", [logAspect: ");
        $r11.append($r8);
        $r11.append(']');
        String $r12 = $r11.toString();
        $r7.size($r8, $r9, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2, String str3, String str4) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        Log_OC.getArray(str3, "key");
        Log_OC.getArray(str4, "value");
        Log $r5 = f32834c;
        boolean $z0 = $r5.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r6 = this.f32842l;
            JSONObject $r7 = new JSONObject();
            $r7.put(str3, str4);
            $r6.add(str, str2, $r7);
            return;
        }
        System $r8 = System.f32375c;
        LogAspect $r9 = LogAspect.MANDATORY;
        LogSeverity $r10 = LogSeverity.WARN;
        TopLevel$NativeErrors $r11 = $r8.get($r9, false, $r10);
        int $i0 = $r11.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r12 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r12.append($r1);
        $r12.append(", [logAspect: ");
        $r12.append($r9);
        $r12.append(']');
        String $r13 = $r12.toString();
        $r8.size($r9, $r10, "Smartlook", $r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2, JSONObject jSONObject) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        Log_OC.getArray(jSONObject, "eventProperties");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            $r5.add(str, str2, jSONObject);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r8 = LogSeverity.WARN;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        int $i0 = $r9.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r10 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r10.append($r1);
        $r10.append(", [logAspect: ");
        $r10.append($r7);
        $r10.append(']');
        String $r12 = $r10.toString();
        $r6.size($r7, $r8, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2, boolean z) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(str2, "value");
        Log $r3 = f32834c;
        boolean $z1 = $r3.get();
        if ($z1) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            JSONObject $r5 = new JSONObject();
            $r5.put(str, str2);
            $r4.m1365d($r5, z);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r8 = LogSeverity.WARN;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        int $i0 = $r9.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r10 = new StringBuilder();
        String $r1 = "setGlobalEventProperty() cannot be called before SDK setup!";
        $r10.append($r1);
        $r10.append(", [logAspect: ");
        $r10.append($r7);
        $r10.append(']');
        String $r12 = $r10.toString();
        $r6.size($r7, $r8, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, JSONObject jSONObject) {
        Log_OC.getArray(str, "eventName");
        Log_OC.getArray(jSONObject, "eventProperties");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.add(str, jSONObject);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "trackCustomEvent() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, boolean z) {
        Log_OC.getArray(str, "properties");
        Log $r3 = f32834c;
        boolean $z1 = $r3.get();
        if ($z1) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            try {
                JSONObject $r5 = new JSONObject(str);
                $r4.m1365d($r5, z);
                return;
            } catch (Exception e) {
                System $r6 = System.f32375c;
                LogAspect $r7 = LogAspect.MANDATORY;
                LogSeverity $r8 = LogSeverity.WARN;
                TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
                int $i0 = $r9.ordinal();
                if ($i0 != 0) {
                    return;
                }
                String $r2 = "setGlobalEventProperties() json serialization failed!, [logAspect: " + $r7 + ']';
                $r6.size($r7, $r8, "Smartlook", $r2);
                return;
            }
        }
        System $r62 = System.f32375c;
        LogAspect $r72 = LogAspect.MANDATORY;
        LogSeverity $r82 = LogSeverity.WARN;
        TopLevel$NativeErrors $r92 = $r62.get($r72, false, $r82);
        int $i02 = $r92.ordinal();
        if ($i02 != 0) {
            return;
        }
        StringBuilder $r10 = new StringBuilder();
        String $r22 = "setGlobalEventProperties() cannot be called before SDK setup!";
        $r10.append($r22);
        $r10.append(", [logAspect: ");
        $r10.append($r72);
        $r10.append(']');
        String $r23 = $r10.toString();
        $r62.size($r72, $r82, "Smartlook", $r23);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(List list) {
        Log_OC.getArray(list, "views");
        C14665f $r4 = this.f32843o;
        SmartlookSensitivity $r1 = SmartlookSensitivity.DEFAULT;
        View[] $r5 = new View[0];
        Object[] $r2 = list.toArray($r5);
        if ($r2 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r6;
        }
        View[] $r52 = (View[]) $r2;
        $r4.m855a($r1, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(JSONObject jSONObject, boolean z) {
        Log_OC.getArray(jSONObject, "eventProperties");
        Log $r2 = f32834c;
        boolean $z1 = $r2.get();
        if ($z1) {
            org.org.org.org.android.model.Log $r3 = this.f32842l;
            $r3.m1365d(jSONObject, z);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r6 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "setGlobalEventProperties() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r5);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r4.size($r5, $r6, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Middleware m628b(List list) {
        org.org.org.org.app.p597ui.Label $r1 = this.f32841k;
        Middleware $r2 = $r1.m1169a(list);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final String m627b(boolean z) {
        Log $r1 = f32834c;
        boolean $z1 = $r1.get();
        if ($z1) {
            Buffer $r2 = this.f32836a;
            String $r3 = Buffer.m946a($r2, null, z, 1, null);
            return $r3;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r6 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r32 = "getDashboardSessionUrl() cannot be called before SDK setup!";
        $r8.append($r32);
        $r8.append(", [logAspect: ");
        $r8.append($r5);
        $r8.append(']');
        String $r33 = $r8.toString();
        $r4.size($r5, $r6, "Smartlook", $r33);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m630b() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14635f $r4 = this.f32847w;
            $r4.close();
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r5.get($r1, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "stopRecording() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r1);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r5.size($r1, $r2, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m629b(String str) {
        Log_OC.getArray(str, "key");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.clear(str);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r2 = "setGlobalEventProperty() cannot be called before SDK setup!";
        $r8.append($r2);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r22 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final List m626c() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14581f $r4 = this.f32837b;
            List $r5 = $r4.m1187a();
            return $r5;
        }
        System $r6 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r6.get($r1, false, $r2);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "currentEnabledIntegrations() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r1);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r6.size($r1, $r2, "Smartlook", $r102);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m625c(String str) {
        Log_OC.getArray(str, "identifier");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14642f $r4 = this.f32838d;
            $r4.m925e(str);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r2 = "setUserIdentifier() cannot be called before SDK setup!";
        $r8.append($r2);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r22 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m624c(String str, String str2) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "eventProperties");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            try {
                JSONObject $r6 = new JSONObject(str2);
                $r5.write(str, $r6);
                return;
            } catch (Exception e) {
                System $r7 = System.f32375c;
                LogAspect $r8 = LogAspect.MANDATORY;
                LogSeverity $r9 = LogSeverity.WARN;
                TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
                int $i0 = $r10.ordinal();
                if ($i0 != 0) {
                    return;
                }
                String $r2 = "stopTimedCustomEvent() json serialization failed!, [logAspect: " + $r8 + ']';
                $r7.size($r8, $r9, "Smartlook", $r2);
                return;
            }
        }
        System $r72 = System.f32375c;
        LogAspect $r82 = LogAspect.MANDATORY;
        LogSeverity $r92 = LogSeverity.WARN;
        TopLevel$NativeErrors $r102 = $r72.get($r82, false, $r92);
        int $i02 = $r102.ordinal();
        if ($i02 != 0) {
            return;
        }
        StringBuilder $r11 = new StringBuilder();
        String $r22 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r11.append($r22);
        $r11.append(", [logAspect: ");
        $r11.append($r82);
        $r11.append(']');
        String $r23 = $r11.toString();
        $r72.size($r82, $r92, "Smartlook", $r23);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m623c(List list) {
        Log_OC.getArray(list, "classes");
        C14665f $r4 = this.f32843o;
        SmartlookSensitivity $r1 = SmartlookSensitivity.EXPLICITLY_SENSITIVE;
        Class[] $r5 = new Class[0];
        Object[] $r2 = list.toArray($r5);
        if ($r2 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r6;
        }
        Class[] $r52 = (Class[]) $r2;
        $r4.m854a($r1, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear() {
        Log $r2 = f32834c;
        boolean $z0 = $r2.get();
        if ($z0) {
            Buffer $r3 = this.f32836a;
            $r3.write((IntegrationListener) null);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r4.get($r5, false, $r1);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "unregisterIntegrationListener() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r5);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r4.size($r5, $r1, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(View view) {
        Log_OC.getArray(view, "view");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r2 = SmartlookSensitivity.EXPLICITLY_SENSITIVE;
        View[] $r4 = {view};
        $r3.m855a($r2, $r4);
    }

    public final void clear(SetupOptions setupOptions) {
        Log_OC.getArray(setupOptions, "setupOptions");
        m619d(setupOptions);
        close();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(SmartlookSensitivity smartlookSensitivity, Class[] clsArr) {
        Log_OC.getArray(smartlookSensitivity, "sensitivity");
        Log_OC.getArray(clsArr, "classes");
        C14665f $r3 = this.f32843o;
        $r3.m854a(smartlookSensitivity, clsArr);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(List list) {
        Log_OC.getArray(list, "classes");
        C14665f $r4 = this.f32843o;
        SmartlookSensitivity $r1 = SmartlookSensitivity.DEFAULT;
        Class[] $r5 = new Class[0];
        Object[] $r2 = list.toArray($r5);
        if ($r2 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r6;
        }
        Class[] $r52 = (Class[]) $r2;
        $r4.m854a($r1, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14635f $r4 = this.f32847w;
            $r4.m970a();
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r5.get($r1, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "startRecording() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r1);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r5.size($r1, $r2, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close(List list) {
        Log_OC.getArray(list, "integrations");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14581f $r4 = this.f32837b;
            $r4.m1183a(list);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "enableIntegrations() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close(boolean z) {
        Log $r2 = f32834c;
        boolean $z1 = $r2.get();
        if ($z1) {
            Buffer $r3 = this.f32836a;
            $r3.write(z);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r4.get($r5, false, $r1);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "resetSession() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r5);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r4.size($r5, $r1, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void create(String str) {
        Enum $r3;
        List $r6;
        Log_OC.getArray(str, "eventTrackingMode");
        Enum[] $r2 = EventTrackingMode.values();
        int $i0 = 0;
        while (true) {
            if ($i0 >= 5) {
                $r3 = null;
                break;
            }
            $r3 = $r2[$i0];
            Enum r7 = $r3;
            String $r4 = r7.name();
            String $r5 = str.toUpperCase();
            Log_OC.loadImage($r5, "(this as java.lang.String).toUpperCase()");
            boolean $z0 = Log_OC.append($r4, $r5);
            if ($z0) {
                break;
            }
            $i0++;
        }
        if ($r3 != null) {
            $r6 = C13724q.m3901b($r3);
            m590e($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final SmartlookSensitivity m613d(Class cls) {
        Log_OC.getArray(cls, "clazz");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r1 = $r3.m853a(cls);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m622d() {
        Log $r2 = f32834c;
        boolean $z0 = $r2.get();
        if ($z0) {
            Attribute $r3 = Attribute.f32368a;
            $r3.m1076a(LogSeverity.DEBUG);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r4.get($r5, false, $r1);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "logCurrentViewHierarchy() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r5);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r4.size($r5, $r1, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m621d(Bundle bundle, boolean z) {
        Log_OC.getArray(bundle, "bundle");
        Log $r2 = f32834c;
        boolean $z1 = $r2.get();
        if ($z1) {
            org.org.org.org.android.model.Log $r3 = this.f32842l;
            C14607f $r4 = C14607f.f32363c;
            JSONObject $r5 = $r4.m1086a(bundle);
            $r3.m1365d($r5, z);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r8 = LogSeverity.WARN;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        int $i0 = $r9.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r10 = new StringBuilder();
        String $r12 = "setGlobalEventProperties() cannot be called before SDK setup!";
        $r10.append($r12);
        $r10.append(", [logAspect: ");
        $r10.append($r7);
        $r10.append(']');
        String $r122 = $r10.toString();
        $r6.size($r7, $r8, "Smartlook", $r122);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m620d(View view) {
        Log_OC.getArray(view, "view");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r2 = SmartlookSensitivity.EXPLICITLY_SENSITIVE;
        View[] $r4 = {view};
        $r3.m855a($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m619d(SetupOptions setupOptions) {
        Log_OC.getArray(setupOptions, "setupOptions");
        boolean $z0 = f32835s;
        if ($z0) {
            return;
        }
        String $r2 = setupOptions.getSmartlookAPIKey();
        Log_OC.loadImage($r2, "setupOptions.smartlookAPIKey");
        boolean $z02 = get($r2);
        if ($z02) {
            BigReal $r3 = this.f32844p;
            $r3.add();
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            $r4.m741a(setupOptions);
            C14635f $r5 = this.f32847w;
            $r5.m968a(setupOptions);
            f32835s = true;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m618d(EventTrackingMode eventTrackingMode) {
        List $r5;
        Log_OC.getArray(eventTrackingMode, "eventTrackingMode");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            $r5 = C13724q.m3901b(eventTrackingMode);
            $r4.read($r5);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r6.get($r7, false, $r1);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r11 = "setEventTrackingMode() cannot be called before SDK setup!";
        $r9.append($r11);
        $r9.append(", [logAspect: ");
        $r9.append($r7);
        $r9.append(']');
        String $r112 = $r9.toString();
        $r6.size($r7, $r1, "Smartlook", $r112);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m617d(RenderingMode renderingMode, RenderingModeOption renderingModeOption) {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            $r4.write(renderingMode, renderingModeOption);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r11 = "setRenderingMode() cannot be called before SDK setup!";
        $r9.append($r11);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r112 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r112);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m616d(LogListener logListener) {
        Log_OC.getArray(logListener, "logListener");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            System.f32375c.remove(logListener);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r4.get($r5, false, $r1);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "registerLogListener() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r5);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r4.size($r5, $r1, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m615d(IntegrationListener integrationListener) {
        Log_OC.getArray(integrationListener, "integrationListener");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            Buffer $r4 = this.f32836a;
            $r4.write(integrationListener);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "registerIntegrationListener() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m614d(Integration integration) {
        List $r5;
        Log_OC.getArray(integration, "integration");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14581f $r4 = this.f32837b;
            $r5 = C13724q.m3901b(integration);
            $r4.m1174b($r5);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r6.get($r7, false, $r1);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r11 = "disableIntegration() cannot be called before SDK setup!";
        $r9.append($r11);
        $r9.append(", [logAspect: ");
        $r9.append($r7);
        $r9.append(']');
        String $r112 = $r9.toString();
        $r6.size($r7, $r1, "Smartlook", $r112);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m612d(String str) {
        Log_OC.getArray(str, "eventId");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.remove(str);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r2 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r8.append($r2);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r22 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m611d(String str, Bundle bundle) {
        Log_OC.getArray(str, "eventId");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.m1367d(str, bundle);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m610d(String str, String str2) {
        Log_OC.getArray(str, "renderingMode");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            RenderingMode.C7229a $r5 = RenderingMode.Companion;
            RenderingModeOption $r6 = null;
            RenderingMode $r7 = RenderingMode.C7229a.m19095a($r5, str, null, 2, null);
            if (str2 != null) {
                RenderingModeOption.C7230a $r8 = RenderingModeOption.Companion;
                $r6 = RenderingModeOption.C7230a.m19093a($r8, str2, null, 2, null);
            }
            $r4.write($r7, $r6);
            return;
        }
        System $r9 = System.f32375c;
        LogAspect $r10 = LogAspect.MANDATORY;
        LogSeverity $r11 = LogSeverity.WARN;
        TopLevel$NativeErrors $r12 = $r9.get($r10, false, $r11);
        int $i0 = $r12.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r13 = new StringBuilder();
        String $r1 = "setRenderingMode() cannot be called before SDK setup!";
        $r13.append($r1);
        $r13.append(", [logAspect: ");
        $r13.append($r10);
        $r13.append(']');
        String $r14 = $r13.toString();
        $r9.size($r10, $r11, "Smartlook", $r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m609d(String str, String str2, Bundle bundle) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            $r5.m1366d(str, str2, bundle);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r8 = LogSeverity.WARN;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        int $i0 = $r9.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r10 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r10.append($r1);
        $r10.append(", [logAspect: ");
        $r10.append($r7);
        $r10.append(']');
        String $r12 = $r10.toString();
        $r6.size($r7, $r8, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m608d(String str, String str2, String str3) {
        C14705f $r4 = C14705f.f32765a;
        $r4.m690a(str);
        $r4.m685l(str2);
        $r4.m687d(str3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m607d(String str, String str2, boolean z) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(str2, "value");
        Log $r3 = f32834c;
        boolean $z1 = $r3.get();
        if ($z1) {
            C14642f $r4 = this.f32838d;
            $r4.add(str, str2, z);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "setUserProperty() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m606d(String str, JSONObject jSONObject) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(jSONObject, "eventProperties");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.write(str, jSONObject);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m605d(String str, boolean z) {
        Log_OC.getArray(str, "sessionProperties");
        Log $r2 = f32834c;
        boolean $z1 = $r2.get();
        if ($z1) {
            C14642f $r3 = this.f32838d;
            $r3.m927d(str, z);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r6 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r1 = "setUserProperties() cannot be called before SDK setup!";
        $r8.append($r1);
        $r8.append(", [logAspect: ");
        $r8.append($r5);
        $r8.append(']');
        String $r12 = $r8.toString();
        $r4.size($r5, $r6, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m604d(List list) {
        Log_OC.getArray(list, "integration");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14581f $r4 = this.f32837b;
            $r4.m1174b(list);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "disableIntegrations() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m603d(JSONObject jSONObject, boolean z) {
        Log_OC.getArray(jSONObject, "sessionProperties");
        Log $r2 = f32834c;
        boolean $z1 = $r2.get();
        if ($z1) {
            C14642f $r3 = this.f32838d;
            $r3.m926d(jSONObject, z);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r6 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "setUserProperties() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r5);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r4.size($r5, $r6, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m595e(String str) {
        Log_OC.getArray(str, "eventName");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            String $r2 = $r4.m1363e(str);
            return $r2;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r22 = "startTimedCustomEvent() cannot be called before SDK setup!";
        $r8.append($r22);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r23 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r23);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m594e(String str, Bundle bundle) {
        Log_OC.getArray(str, "eventName");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            String $r1 = $r4.m1362e(str, bundle);
            return $r1;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r12 = "startTimedCustomEvent() cannot be called before SDK setup!";
        $r9.append($r12);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r13 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r13);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m593e(String str, String str2) {
        Log_OC.getArray(str, "eventName");
        Log_OC.getArray(str2, "eventProperties");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            try {
                JSONObject $r6 = new JSONObject(str2);
                String $r2 = $r5.m1361e(str, $r6);
                return $r2;
            } catch (Exception e) {
                System $r7 = System.f32375c;
                LogAspect $r8 = LogAspect.MANDATORY;
                LogSeverity $r9 = LogSeverity.WARN;
                TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
                int $i0 = $r10.ordinal();
                if ($i0 != 0) {
                    return null;
                }
                String $r22 = "startTimedCustomEvent() json serialization failed!, [logAspect: " + $r8 + ']';
                $r7.size($r8, $r9, "Smartlook", $r22);
                return null;
            }
        }
        System $r72 = System.f32375c;
        LogAspect $r82 = LogAspect.MANDATORY;
        LogSeverity $r92 = LogSeverity.WARN;
        TopLevel$NativeErrors $r102 = $r72.get($r82, false, $r92);
        int $i02 = $r102.ordinal();
        if ($i02 != 0) {
            return null;
        }
        StringBuilder $r11 = new StringBuilder();
        String $r23 = "startTimedCustomEvent() cannot be called before SDK setup!";
        $r11.append($r23);
        $r11.append(", [logAspect: ");
        $r11.append($r82);
        $r11.append(']');
        String $r24 = $r11.toString();
        $r72.size($r82, $r92, "Smartlook", $r24);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m592e(String str, String str2, String str3) {
        Log_OC.getArray(str, "eventName");
        Log_OC.getArray(str2, "key");
        Log_OC.getArray(str3, "value");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            JSONObject $r6 = new JSONObject();
            $r6.put(str2, str3);
            String $r1 = $r5.m1361e(str, $r6);
            return $r1;
        }
        System $r7 = System.f32375c;
        LogAspect $r8 = LogAspect.MANDATORY;
        LogSeverity $r9 = LogSeverity.WARN;
        TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
        int $i0 = $r10.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r11 = new StringBuilder();
        String $r12 = "startTimedCustomEvent() cannot be called before SDK setup!";
        $r11.append($r12);
        $r11.append(", [logAspect: ");
        $r11.append($r8);
        $r11.append(']');
        String $r13 = $r11.toString();
        $r7.size($r8, $r9, "Smartlook", $r13);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m591e(String str, JSONObject jSONObject) {
        Log_OC.getArray(str, "eventName");
        Log_OC.getArray(jSONObject, "eventProperties");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            String $r1 = $r4.m1361e(str, jSONObject);
            return $r1;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r12 = "startTimedCustomEvent() cannot be called before SDK setup!";
        $r9.append($r12);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r13 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r13);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m602e() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14581f $r4 = this.f32837b;
            $r4.m1176b();
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r5.get($r1, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "disableAllIntegrations() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r1);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r5.size($r1, $r2, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m601e(Bundle bundle, boolean z) {
        Log_OC.getArray(bundle, "sessionProperties");
        Log $r2 = f32834c;
        boolean $z1 = $r2.get();
        if ($z1) {
            C14642f $r3 = this.f32838d;
            $r3.m929d(bundle, z);
            return;
        }
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.MANDATORY;
        LogSeverity $r6 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "setUserProperties() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r5);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r4.size($r5, $r6, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m600e(View view) {
        Log_OC.getArray(view, "view");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r2 = SmartlookSensitivity.DEFAULT;
        View[] $r4 = {view};
        $r3.m855a($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m599e(BridgeInterface bridgeInterface) {
        Log_OC.getArray(bridgeInterface, "bridgeInterface");
        Label $r2 = this.f32840i;
        $r2.m639a(bridgeInterface);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m598e(UserProperties userProperties) {
        Log_OC.getArray(userProperties, "userProperties");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14642f $r4 = this.f32838d;
            $r4.clear(userProperties);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "setUserProperties() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m597e(Integration integration) {
        List $r5;
        Log_OC.getArray(integration, "integration");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14581f $r4 = this.f32837b;
            $r5 = C13724q.m3901b(integration);
            $r4.m1183a($r5);
            return;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r6.get($r7, false, $r1);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r11 = "enableIntegration() cannot be called before SDK setup!";
        $r9.append($r11);
        $r9.append(", [logAspect: ");
        $r9.append($r7);
        $r9.append(']');
        String $r112 = $r9.toString();
        $r6.size($r7, $r1, "Smartlook", $r112);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m596e(Class cls) {
        Log_OC.getArray(cls, "clazz");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r2 = SmartlookSensitivity.DEFAULT;
        Class[] $r4 = {cls};
        $r3.m854a($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m590e(List list) {
        Log_OC.getArray(list, "eventTrackingMode");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            $r4.read(list);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "setEventTrackingMode() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r8 == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.smartlook.sdk.smartlook.Smartlook.SetupOptionsBuilder execute(java.lang.String r12) throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.String r0 = "options"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r12)
            java.lang.String r0 = "ApiKey"
            java.lang.String r12 = org.org.org.org.asm.util.Collection.getString(r1, r0)
            java.lang.String r0 = "Fps"
            int r2 = r1.getInt(r0)
            java.lang.String r0 = "StartNewSession"
            boolean r3 = r1.getBoolean(r0)
            java.lang.String r0 = "StartNewSessionAndUser"
            boolean r4 = r1.getBoolean(r0)
            r5 = 1
            java.lang.String r0 = "UseAdaptiveFramerate"
            r7 = 1
            boolean r6 = r1.optBoolean(r0, r7)
            if (r12 == 0) goto L35
            java.lang.String r0 = ""
            boolean r8 = kotlin.p483e0.p485d.Log_OC.append(r12, r0)
            if (r8 != 0) goto L35
            goto L36
        L35:
            r5 = 0
        L36:
            if (r5 == 0) goto L56
            com.smartlook.sdk.smartlook.Smartlook$SetupOptionsBuilder r9 = new com.smartlook.sdk.smartlook.Smartlook$SetupOptionsBuilder
            r9.<init>(r12)
            com.smartlook.sdk.smartlook.Smartlook$SetupOptionsBuilder r9 = r9.useAdaptiveFramerate(r6)
            com.smartlook.sdk.smartlook.Smartlook$SetupOptionsBuilder r9 = r9.setFps(r2)
            if (r3 == 0) goto L4b
            r9.startNewSession()
            goto L50
        L4b:
            if (r4 == 0) goto L50
            r9.startNewSessionAndUser()
        L50:
            java.lang.String r0 = "optionsBuilder"
            kotlin.p483e0.p485d.Log_OC.loadImage(r9, r0)
            return r9
        L56:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed requirement."
            java.lang.String r12 = r12.toString()
            r10.<init>(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.locale.C14709f.execute(java.lang.String):com.smartlook.sdk.smartlook.Smartlook$SetupOptionsBuilder");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final void m589f(int i) {
        C14665f $r1 = this.f32843o;
        Integer $r2 = Integer.valueOf(i);
        $r1.m852a($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final void m588f(RecordingMask recordingMask) {
        C14665f $r2 = this.f32843o;
        $r2.m850c(recordingMask);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final void m587f(String str) {
        Log_OC.getArray(str, "smartlookAPIKey");
        SetupOptions $r2 = new SetupOptions(str);
        m619d($r2);
        close();
    }

    /* renamed from: f */
    public final void m586f(List list) {
        m631a(this, list, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get() {
        Log $r2 = f32834c;
        boolean $z0 = $r2.get();
        if ($z0) {
            Buffer $r3 = this.f32836a;
            String $r4 = Buffer.next($r3, null, 1, null);
            return $r4;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r42 = "getDashboardVisitorUrl() cannot be called before SDK setup!";
        $r8.append($r42);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r43 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r43);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m585i() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.m1371b();
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r6 = $r5.get($r1, false, $r2);
        int $i0 = $r6.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r7 = new StringBuilder();
        String $r9 = "setGlobalEventProperty() cannot be called before SDK setup!";
        $r7.append($r9);
        $r7.append(", [logAspect: ");
        $r7.append($r1);
        $r7.append(']');
        String $r92 = $r7.toString();
        $r5.size($r1, $r2, "Smartlook", $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m584i(View view) {
        Log_OC.getArray(view, "view");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r2 = SmartlookSensitivity.EXPLICITLY_INSENSITIVE;
        View[] $r4 = {view};
        $r3.m855a($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m583i(Class cls) {
        Log_OC.getArray(cls, "clazz");
        C14665f $r3 = this.f32843o;
        SmartlookSensitivity $r2 = SmartlookSensitivity.EXPLICITLY_SENSITIVE;
        Class[] $r4 = {cls};
        $r3.m854a($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m582i(String str) {
        Log_OC.getArray(str, "eventName");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.m1360i(str);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r5.get($r6, false, $r1);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r2 = "trackCustomEvent() cannot be called before SDK setup!";
        $r8.append($r2);
        $r8.append(", [logAspect: ");
        $r8.append($r6);
        $r8.append(']');
        String $r22 = $r8.toString();
        $r5.size($r6, $r1, "Smartlook", $r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m581i(String str, String str2) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r4 = this.f32842l;
            $r4.add(str, str2);
            return;
        }
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.MANDATORY;
        LogSeverity $r7 = LogSeverity.WARN;
        TopLevel$NativeErrors $r8 = $r5.get($r6, false, $r7);
        int $i0 = $r8.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r9.append($r1);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r12 = $r9.toString();
        $r5.size($r6, $r7, "Smartlook", $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m580i(String str, String str2, String str3) {
        Log_OC.getArray(str, "name");
        Log_OC.getArray(str3, "viewState");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            Logger $r5 = this.f32839f;
            ViewType.C7217a $r6 = ViewType.Companion;
            ViewType $r7 = ViewType.C7217a.m19118a($r6, str2, null, 2, null);
            ViewState.C7216a $r8 = ViewState.Companion;
            ViewState $r9 = ViewState.C7216a.m19120a($r8, str3, null, 2, null);
            $r5.add(str, $r7, $r9, true);
            return;
        }
        System $r10 = System.f32375c;
        LogAspect $r11 = LogAspect.MANDATORY;
        LogSeverity $r12 = LogSeverity.WARN;
        TopLevel$NativeErrors $r13 = $r10.get($r11, false, $r12);
        int $i0 = $r13.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r14 = new StringBuilder();
        String $r1 = "trackBridgeNavigationEvent() cannot be called before SDK setup!";
        $r14.append($r1);
        $r14.append(", [logAspect: ");
        $r14.append($r11);
        $r14.append(']');
        String $r15 = $r14.toString();
        $r10.size($r11, $r12, "Smartlook", $r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m579i(List list) {
        Log_OC.getArray(list, "views");
        C14665f $r4 = this.f32843o;
        SmartlookSensitivity $r1 = SmartlookSensitivity.EXPLICITLY_INSENSITIVE;
        View[] $r5 = new View[0];
        Object[] $r2 = list.toArray($r5);
        if ($r2 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r6;
        }
        View[] $r52 = (View[]) $r2;
        $r4.m855a($r1, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: k */
    public final boolean m578k() {
        Buffer $r1 = this.f32836a;
        String $r2 = $r1.add();
        boolean $z0 = f32835s;
        if ($z0) {
            Buffer $r12 = this.f32836a;
            boolean $z02 = $r12.clear();
            if (!$z02 || $r2 == null) {
                return false;
            }
            org.org.org.org.org.data.Label $r3 = this.f32845r;
            boolean $z03 = $r3.m758a($r2);
            return $z03;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: l */
    public final void m577l(String str) {
        Log_OC.getArray(str, "smartlookAPIKey");
        SetupOptions $r2 = new SetupOptions(str);
        m619d($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void next() {
        Log $r2 = f32834c;
        boolean $z0 = $r2.get();
        if ($z0) {
            System.f32375c.remove(null);
            return;
        }
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.MANDATORY;
        LogSeverity $r1 = LogSeverity.WARN;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r1);
        int $i0 = $r5.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r6 = new StringBuilder();
        String $r8 = "unregisterLogListener() cannot be called before SDK setup!";
        $r6.append($r8);
        $r6.append(", [logAspect: ");
        $r6.append($r4);
        $r6.append(']');
        String $r82 = $r6.toString();
        $r3.size($r4, $r1, "Smartlook", $r82);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCreateView(List list) {
        Log_OC.getArray(list, "views");
        C14665f $r4 = this.f32843o;
        SmartlookSensitivity $r1 = SmartlookSensitivity.DEFAULT;
        View[] $r5 = new View[0];
        Object[] $r2 = list.toArray($r5);
        if ($r2 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r6;
        }
        View[] $r52 = (View[]) $r2;
        $r4.m855a($r1, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void parse(String str, String str2, String str3) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        Log_OC.getArray(str3, "eventProperties");
        Log $r5 = f32834c;
        boolean $z0 = $r5.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r6 = this.f32842l;
            try {
                JSONObject $r7 = new JSONObject(str3);
                $r6.add(str, str2, $r7);
                return;
            } catch (Exception e) {
                System $r8 = System.f32375c;
                LogAspect $r9 = LogAspect.MANDATORY;
                LogSeverity $r10 = LogSeverity.WARN;
                TopLevel$NativeErrors $r11 = $r8.get($r9, false, $r10);
                int $i0 = $r11.ordinal();
                if ($i0 != 0) {
                    return;
                }
                String $r2 = "cancelTimedCustomEvent() json serialization failed!, [logAspect: " + $r9 + ']';
                $r8.size($r9, $r10, "Smartlook", $r2);
                return;
            }
        }
        System $r82 = System.f32375c;
        LogAspect $r92 = LogAspect.MANDATORY;
        LogSeverity $r102 = LogSeverity.WARN;
        TopLevel$NativeErrors $r112 = $r82.get($r92, false, $r102);
        int $i02 = $r112.ordinal();
        if ($i02 != 0) {
            return;
        }
        StringBuilder $r12 = new StringBuilder();
        String $r22 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r12.append($r22);
        $r12.append(", [logAspect: ");
        $r12.append($r92);
        $r12.append(']');
        String $r23 = $r12.toString();
        $r82.size($r92, $r102, "Smartlook", $r23);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RenderingModeOption set() {
        Log $r3 = f32834c;
        boolean $z0 = $r3.get();
        if ($z0) {
            org.org.org.org.org.data.Label $r4 = this.f32845r;
            RenderingModeOption $r5 = $r4.clear();
            return $r5;
        }
        System $r6 = System.f32375c;
        LogAspect $r1 = LogAspect.MANDATORY;
        LogSeverity $r2 = LogSeverity.WARN;
        TopLevel$NativeErrors $r7 = $r6.get($r1, false, $r2);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return null;
        }
        StringBuilder $r8 = new StringBuilder();
        String $r10 = "currentRenderingModeOption() cannot be called before SDK setup!";
        $r8.append($r10);
        $r8.append(", [logAspect: ");
        $r8.append($r1);
        $r8.append(']');
        String $r102 = $r8.toString();
        $r6.size($r1, $r2, "Smartlook", $r102);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setEnabled(SmartlookSensitivity smartlookSensitivity, View[] viewArr) {
        Log_OC.getArray(smartlookSensitivity, "sensitivity");
        Log_OC.getArray(viewArr, "view");
        C14665f $r3 = this.f32843o;
        $r3.m855a(smartlookSensitivity, viewArr);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void update(String str, String str2, String str3) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "key");
        Log_OC.getArray(str3, "value");
        Log $r4 = f32834c;
        boolean $z0 = $r4.get();
        if ($z0) {
            org.org.org.org.android.model.Log $r5 = this.f32842l;
            JSONObject $r6 = new JSONObject();
            $r6.put(str2, str3);
            $r5.write(str, $r6);
            return;
        }
        System $r7 = System.f32375c;
        LogAspect $r8 = LogAspect.MANDATORY;
        LogSeverity $r9 = LogSeverity.WARN;
        TopLevel$NativeErrors $r10 = $r7.get($r8, false, $r9);
        int $i0 = $r10.ordinal();
        if ($i0 != 0) {
            return;
        }
        StringBuilder $r11 = new StringBuilder();
        String $r1 = "stopTimedCustomEvent() cannot be called before SDK setup!";
        $r11.append($r1);
        $r11.append(", [logAspect: ");
        $r11.append($r8);
        $r11.append(']');
        String $r12 = $r11.toString();
        $r7.size($r8, $r9, "Smartlook", $r12);
    }
}
