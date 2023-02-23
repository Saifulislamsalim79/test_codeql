package org.org.org.org.android.model;

import android.os.Bundle;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.a.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Location;
import org.org.org.org.asm.graph.C14601i;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.C14705f;
/* loaded from: classes.dex */
public final class Log {

    /* renamed from: a */
    public final HashMap<String, a.a> f32097a;

    /* renamed from: b */
    public JSONObject f32098b;

    /* renamed from: c */
    public JSONObject f32099c;

    /* renamed from: o */
    public JSONObject f32100o;

    /* renamed from: q */
    public ArrayList<e.a.a.a.a.d.b.a> f32101q;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Log() {
        ArrayList $r1 = new ArrayList();
        this.f32101q = $r1;
        HashMap $r2 = new HashMap();
        this.f32097a = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final JSONObject m1372a() {
        List $r4;
        JSONObject $r1 = this.f32100o;
        if ($r1 == null) {
            C14607f $r2 = C14607f.f32363c;
            JSONObject $r12 = write();
            JSONObject $r13 = get();
            JSONObject[] $r3 = {$r12, $r13};
            $r4 = C13726r.m3888h($r3);
            JSONObject $r14 = $r2.add($r4, false);
            this.f32100o = $r14;
        }
        JSONObject $r15 = this.f32100o;
        return $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m1370d() {
        this.f32100o = null;
        JSONObject $r2 = this.f32099c;
        String $r1 = String.valueOf($r2);
        m1368d($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final JSONObject get() {
        JSONObject $r4 = this.f32099c;
        if ($r4 == null) {
            try {
                String $r5 = value();
                if ($r5 != null) {
                    JSONObject $r42 = new JSONObject($r5);
                    this.f32099c = $r42;
                }
            } catch (Exception $r6) {
                System $r7 = System.f32375c;
                LogAspect $r1 = LogAspect.CUSTOM_EVENTS;
                LogSeverity $r2 = LogSeverity.ERROR;
                TopLevel$NativeErrors $r8 = $r7.get($r1, true, $r2);
                int $i0 = $r8.ordinal();
                if ($i0 == 0) {
                    StringBuilder $r9 = new StringBuilder();
                    StringBuilder $r3 = new StringBuilder();
                    $r3.append("loadGlobalEventImmutableProperties() exception = ");
                    String $r52 = org.org.org.org.asm.parser.Log.get($r6, false, 2, null);
                    $r3.append($r52);
                    String $r53 = $r3.toString();
                    $r9.append($r53);
                    $r9.append(", [logAspect: ");
                    $r9.append($r1);
                    $r9.append(']');
                    String $r54 = $r9.toString();
                    $r7.size($r1, $r2, "TrackingHandler", $r54);
                }
            }
        }
        JSONObject $r43 = this.f32099c;
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void init() {
        this.f32100o = null;
        JSONObject $r2 = this.f32098b;
        String $r1 = String.valueOf($r2);
        add($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final JSONObject write() {
        JSONObject $r4 = this.f32098b;
        if ($r4 == null) {
            try {
                String $r5 = m1364e();
                if ($r5 != null) {
                    JSONObject $r42 = new JSONObject($r5);
                    this.f32098b = $r42;
                }
            } catch (Exception $r6) {
                System $r7 = System.f32375c;
                LogAspect $r1 = LogAspect.CUSTOM_EVENTS;
                LogSeverity $r2 = LogSeverity.ERROR;
                TopLevel$NativeErrors $r8 = $r7.get($r1, true, $r2);
                int $i0 = $r8.ordinal();
                if ($i0 == 0) {
                    StringBuilder $r9 = new StringBuilder();
                    StringBuilder $r3 = new StringBuilder();
                    $r3.append("loadGlobalEventProperties() exception = ");
                    String $r52 = org.org.org.org.asm.parser.Log.get($r6, false, 2, null);
                    $r3.append($r52);
                    String $r53 = $r3.toString();
                    $r9.append($r53);
                    $r9.append(", [logAspect: ");
                    $r9.append($r1);
                    $r9.append(']');
                    String $r54 = $r9.toString();
                    $r7.size($r1, $r2, "TrackingHandler", $r54);
                }
            }
        }
        JSONObject $r43 = this.f32098b;
        return $r43;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str) {
        Log_OC.getArray(str, "globalProperties");
        C14705f $r2 = C14705f.f32765a;
        $r2.remove(str, "ANALYTICS_GLOBAL_PROPS");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, Bundle bundle) {
        Log_OC.getArray(str, "eventName");
        C14607f $r4 = C14607f.f32363c;
        JSONObject $r2 = $r4.m1086a(bundle);
        add(str, $r2);
    }

    public final void add(String str, String str2) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        add(str, str2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2, JSONObject jSONObject) {
        List $r17;
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.CUSTOM_EVENTS;
        LogSeverity $r6 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r9 = new StringBuilder();
            $r9.append("cancelTimedCustomEvent() called with: ");
            $r9.append("eventId = ");
            $r9.append(str);
            $r9.append(", ");
            $r9.append("reason = ");
            $r9.append(str2);
            $r9.append(", ");
            $r9.append("eventProperties = ");
            String $r10 = org.org.org.org.asm.parser.Log.get(jSONObject, false, 2, null);
            $r9.append($r10);
            String $r102 = $r9.toString();
            $r8.append($r102);
            $r8.append(", [logAspect: ");
            $r8.append($r5);
            $r8.append(']');
            String $r103 = $r8.toString();
            $r4.size($r5, $r6, "TrackingHandler", $r103);
        }
        HashMap $r11 = this.f32097a;
        boolean $z0 = $r11.containsKey(str);
        if ($z0) {
            HashMap $r112 = this.f32097a;
            Object $r12 = $r112.remove(str);
            Log_OC.append($r12);
            Log_OC.loadImage($r12, "timedEvents.remove(eventId)!!");
            Status $r13 = (Status) $r12;
            C14607f $r14 = C14607f.f32363c;
            JSONObject $r16 = $r13.get();
            JSONObject $r3 = m1372a();
            JSONObject[] $r15 = {$r16, jSONObject, $r3};
            $r17 = C13726r.m3888h($r15);
            JSONObject $r32 = $r14.add($r17, false);
            long $l1 = System.currentTimeMillis();
            long $l2 = $r13.getTime();
            ArrayList $r18 = this.f32101q;
            String $r2 = $r13.getMessage();
            Location $r19 = new Location($r2, $r32, $l1 - $l2, str2);
            $r18.add($r19);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, JSONObject jSONObject) {
        List $r12;
        Log_OC.getArray(str, "eventName");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.CUSTOM_EVENTS;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("trackCustomEvent() called with: ");
            $r8.append("eventName = ");
            $r8.append(str);
            $r8.append(", ");
            $r8.append("eventProperties = ");
            String $r9 = org.org.org.org.asm.parser.Log.get(jSONObject, false, 2, null);
            $r8.append($r9);
            String $r92 = $r8.toString();
            $r7.append($r92);
            $r7.append(", [logAspect: ");
            $r7.append($r4);
            $r7.append(']');
            String $r93 = $r7.toString();
            $r3.size($r4, $r5, "TrackingHandler", $r93);
        }
        C14607f $r10 = C14607f.f32363c;
        JSONObject $r2 = m1372a();
        JSONObject[] $r11 = {jSONObject, $r2};
        $r12 = C13726r.m3888h($r11);
        JSONObject $r22 = $r10.add($r12, false);
        ArrayList $r13 = this.f32101q;
        Location $r14 = new Location(str, $r22, 0L, null, 12, null);
        $r13.add($r14);
    }

    /* renamed from: b */
    public final void m1371b() {
        this.f32100o = null;
        this.f32098b = null;
        this.f32099c = null;
        clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear() {
        C14705f $r1 = C14705f.f32765a;
        String[] $r2 = {"ANALYTICS_GLOBAL_PROPS", "ANALYTICS_GLOBAL_IMMUTABLE_PROPS"};
        $r1.clear($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(String str) {
        Log_OC.getArray(str, "propertyKey");
        write();
        get();
        JSONObject $r2 = this.f32098b;
        if ($r2 != null) {
            if ($r2 != null) {
                $r2.remove(str);
            }
            init();
        }
        JSONObject $r22 = this.f32099c;
        if ($r22 != null) {
            if ($r22 != null) {
                $r22.remove(str);
            }
            m1370d();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m1368d(String str) {
        Log_OC.getArray(str, "globalImmutableProperties");
        C14705f $r2 = C14705f.f32765a;
        $r2.remove(str, "ANALYTICS_GLOBAL_IMMUTABLE_PROPS");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m1367d(String str, Bundle bundle) {
        Log_OC.getArray(str, "eventId");
        C14607f $r4 = C14607f.f32363c;
        JSONObject $r2 = $r4.m1086a(bundle);
        write(str, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m1366d(String str, String str2, Bundle bundle) {
        Log_OC.getArray(str, "eventId");
        Log_OC.getArray(str2, "reason");
        C14607f $r5 = C14607f.f32363c;
        JSONObject $r3 = $r5.m1086a(bundle);
        add(str, str2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m1365d(JSONObject $r2, boolean z) {
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.CUSTOM_EVENTS;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r1);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "setGlobalEventProperties() called with: eventProperties = " + $r2 + ", immutable = " + z;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r3.size($r4, $r1, "TrackingHandler", $r82);
        }
        C14607f $r9 = C14607f.f32363c;
        if ($r2 != null) {
            $r9.doInBackground($r2);
            if (z) {
                JSONObject $r10 = get();
                this.f32099c = $r9.toString($r10, $r2, z);
                m1370d();
                return;
            }
            JSONObject $r102 = write();
            this.f32098b = $r9.toString($r102, $r2, z);
            init();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final boolean m1369d(EventTrackingMode eventTrackingMode) {
        Log_OC.getArray(eventTrackingMode, "prohibitedEventTrackingMode");
        EventTrackingMode $r2 = EventTrackingMode.FULL_TRACKING;
        if (eventTrackingMode == $r2) {
            return true;
        }
        byte $b0 = eventTrackingMode.getCode();
        byte $b1 = $r2.getCode();
        byte $b02 = (byte) ($b0 ^ $b1);
        C14705f $r3 = C14705f.f32765a;
        byte $b12 = $r3.m689b();
        return ((byte) ($b02 & $b12)) > 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1364e() {
        C14705f $r2 = C14705f.f32765a;
        String $r1 = $r2.toString("ANALYTICS_GLOBAL_PROPS");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1363e(String str) {
        Log_OC.getArray(str, "eventName");
        String $r1 = m1361e(str, (JSONObject) null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1362e(String str, Bundle bundle) {
        Log_OC.getArray(str, "eventName");
        C14607f $r3 = C14607f.f32363c;
        JSONObject $r4 = $r3.m1086a(bundle);
        String $r1 = m1361e(str, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1361e(String str, JSONObject jSONObject) {
        Log_OC.getArray(str, "eventName");
        System $r4 = System.f32375c;
        LogAspect $r5 = LogAspect.CUSTOM_EVENTS;
        LogSeverity $r6 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r4.get($r5, false, $r6);
        int $i0 = $r7.ordinal();
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            $r8.append("startTimedCustomEvent() called with: eventName = " + str + ",eventProperties = " + org.org.org.org.asm.parser.Log.get(jSONObject, false, 2, null));
            $r8.append(", [logAspect: ");
            $r8.append($r5);
            $r8.append(']');
            $r4.size($r5, $r6, "TrackingHandler", $r8.toString());
        }
        C14601i $r10 = C14601i.f32355b;
        String $r9 = $r10.m1101e();
        HashMap $r11 = this.f32097a;
        Status $r12 = new Status(str, jSONObject);
        $r11.put($r9, $r12);
        return $r9;
    }

    /* renamed from: i */
    public final void m1360i(String str) {
        Log_OC.getArray(str, "eventName");
        add(str, (JSONObject) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList initialize() {
        ArrayList $r2;
        ArrayList $r1 = this.f32101q;
        synchronized ($r1) {
            ArrayList $r3 = this.f32101q;
            $r2 = new ArrayList($r3);
            ArrayList $r32 = new ArrayList();
            this.f32101q = $r32;
        }
        return $r2;
    }

    public final void remove(String str) {
        Log_OC.getArray(str, "eventId");
        write(str, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String value() {
        C14705f $r2 = C14705f.f32765a;
        String $r1 = $r2.toString("ANALYTICS_GLOBAL_IMMUTABLE_PROPS");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x005a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(java.lang.String r22) {
        /*
            r21 = this;
            java.lang.String r2 = "reason"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            org.org.org.org.asm.parser.System r3 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r4 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.CUSTOM_EVENTS
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r5 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r7 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r6 = r3.get(r4, r7, r5)
            int r8 = r6.ordinal()
            if (r8 == 0) goto L19
            goto L4a
        L19:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "cancelAllTimedEvents() called with: reason = "
            r10.append(r2)
            r0 = r22
            r10.append(r0)
            java.lang.String r11 = r10.toString()
            r9.append(r11)
            java.lang.String r2 = ", [logAspect: "
            r9.append(r2)
            r9.append(r4)
            r7 = 93
            r9.append(r7)
            java.lang.String r11 = r9.toString()
            java.lang.String r2 = "TrackingHandler"
            r3.size(r4, r5, r2, r11)
        L4a:
            r0 = r21
            java.util.HashMap<java.lang.String, e.a.a.a.a.d.a$a> r12 = r0.f32097a
            java.util.Set r13 = r12.entrySet()
            java.util.Iterator r14 = r13.iterator()
        L56:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L80
            java.lang.Object r16 = r14.next()
            r18 = r16
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
            r17 = r18
            r0 = r17
            java.lang.Object r16 = r0.getValue()
            r20 = r16
            org.org.org.org.android.model.Status r20 = (org.org.org.org.android.model.Status) r20
            r19 = r20
            r0 = r19
            java.lang.String r11 = r0.getMessage()
            r0 = r21
            r1 = r22
            r0.add(r11, r1)
            goto L56
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.model.Log.write(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str, JSONObject jSONObject) {
        List $r16;
        Log_OC.getArray(str, "eventId");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.CUSTOM_EVENTS;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("stopTimedCustomEvent() called with: ");
            $r8.append("eventId = ");
            $r8.append(str);
            $r8.append(", ");
            $r8.append("eventProperties = ");
            String $r9 = org.org.org.org.asm.parser.Log.get(jSONObject, false, 2, null);
            $r8.append($r9);
            String $r92 = $r8.toString();
            $r7.append($r92);
            $r7.append(", [logAspect: ");
            $r7.append($r4);
            $r7.append(']');
            String $r93 = $r7.toString();
            $r3.size($r4, $r5, "TrackingHandler", $r93);
        }
        HashMap $r10 = this.f32097a;
        boolean $z0 = $r10.containsKey(str);
        if ($z0) {
            HashMap $r102 = this.f32097a;
            Object $r11 = $r102.remove(str);
            Log_OC.append($r11);
            Log_OC.loadImage($r11, "timedEvents.remove(eventId)!!");
            Status $r12 = (Status) $r11;
            C14607f $r13 = C14607f.f32363c;
            JSONObject $r15 = $r12.get();
            JSONObject $r2 = m1372a();
            JSONObject[] $r14 = {$r15, jSONObject, $r2};
            $r16 = C13726r.m3888h($r14);
            JSONObject $r22 = $r13.add($r16, false);
            long $l1 = System.currentTimeMillis();
            long $l2 = $r12.getTime();
            ArrayList $r17 = this.f32101q;
            String $r1 = $r12.getMessage();
            Location $r18 = new Location($r1, $r22, $l1 - $l2, null, 8, null);
            $r17.add($r18);
        }
    }
}
