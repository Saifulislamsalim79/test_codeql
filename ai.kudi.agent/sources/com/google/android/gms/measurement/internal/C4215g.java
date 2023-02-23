package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.List;
import com.google.android.gms.common.p102o.C2955b;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2975m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes.dex */
public final class C4215g extends MethodWriter {

    /* renamed from: a */
    private Boolean f10270a;

    /* renamed from: b */
    private InterfaceC4204f f10271b;

    /* renamed from: d */
    private Boolean f10272d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C4215g(ClassWriter classWriter) {
        super(classWriter);
        C4193e $r2 = C4193e.f10223a;
        this.f10271b = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m28264a(String str, String str2) {
        try {
            Class $r4 = Class.forName("android.os.SystemProperties");
            Class[] $r1 = {String.class, String.class};
            Method $r5 = $r4.getMethod("get", $r1);
            Object[] $r6 = {str, ""};
            Object $r7 = $r5.invoke(null, $r6);
            String str3 = (String) $r7;
            List.m31820a(str3);
            return str3;
        } catch (ClassNotFoundException $r14) {
            ClassWriter $r9 = super.f9987b;
            Item $r10 = $r9.get();
            C4312o3 $r11 = $r10.m28416b();
            $r11.m28013b("Could not find SystemProperties class", $r14);
            return "";
        } catch (IllegalAccessException $r12) {
            ClassWriter $r92 = super.f9987b;
            Item $r102 = $r92.get();
            C4312o3 $r112 = $r102.m28416b();
            $r112.m28013b("Could not access SystemProperties.get()", $r12);
            return "";
        } catch (NoSuchMethodException $r13) {
            ClassWriter $r93 = super.f9987b;
            Item $r103 = $r93.get();
            C4312o3 $r113 = $r103.m28416b();
            $r113.m28013b("Could not find SystemProperties.get() method", $r13);
            return "";
        } catch (InvocationTargetException $r8) {
            ClassWriter $r94 = super.f9987b;
            Item $r104 = $r94.get();
            C4312o3 $r114 = $r104.m28416b();
            $r114.m28013b("SystemProperties.get() threw an exception", $r8);
            return "";
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final long distance() {
        C4162b3 $r0 = C4173c3.f10121d;
        Object $r1 = $r0.m28406a(null);
        Long $r2 = (Long) $r1;
        long $l0 = $r2.longValue();
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final long getId() {
        C4162b3 $r0 = C4173c3.f10092D;
        Object $r1 = $r0.m28406a(null);
        Long $r2 = (Long) $r1;
        long $l0 = $r2.longValue();
        return $l0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Boolean m28266a(String str) {
        List.get(str);
        Bundle $r2 = onCreateView();
        if ($r2 == null) {
            ClassWriter $r3 = super.f9987b;
            Item $r4 = $r3.get();
            C4312o3 $r5 = $r4.m28416b();
            $r5.m28014a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        boolean $z0 = $r2.containsKey(str);
        if ($z0) {
            boolean $z02 = $r2.getBoolean(str);
            Boolean $r6 = Boolean.valueOf($z02);
            return $r6;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28267a() {
        Boolean $r1 = this.f10272d;
        if ($r1 == null) {
            synchronized (this) {
                Boolean $r12 = this.f10272d;
                if ($r12 == null) {
                    ClassWriter $r2 = super.f9987b;
                    Context $r3 = $r2.getContext();
                    ApplicationInfo $r4 = $r3.getApplicationInfo();
                    String $r5 = C2975m.m31511a();
                    if ($r4 != null) {
                        String $r6 = $r4.processName;
                        boolean $z0 = false;
                        if ($r6 != null) {
                            boolean $z1 = $r6.equals($r5);
                            if ($z1) {
                                $z0 = true;
                            }
                        }
                        Boolean $r13 = Boolean.valueOf($z0);
                        this.f10272d = $r13;
                    }
                    Boolean $r14 = this.f10272d;
                    if ($r14 == null) {
                        Boolean $r15 = Boolean.TRUE;
                        this.f10272d = $r15;
                        ClassWriter $r22 = super.f9987b;
                        Item $r7 = $r22.get();
                        C4312o3 $r8 = $r7.m28416b();
                        $r8.m28014a("My process not in the list of running processes");
                    }
                }
            }
        }
        Boolean $r16 = this.f10272d;
        return $r16.booleanValue();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28265a(String str, C4162b3 c4162b3) {
        if (str == null) {
            Object $r3 = c4162b3.m28406a(null);
            Boolean $r4 = (Boolean) $r3;
            boolean $z0 = $r4.booleanValue();
            return $z0;
        }
        InterfaceC4204f $r5 = this.f10271b;
        String $r6 = c4162b3.m28405b();
        String $r2 = $r5.mo27967e(str, $r6);
        boolean $z02 = TextUtils.isEmpty($r2);
        if ($z02) {
            Object $r32 = c4162b3.m28406a(null);
            Boolean $r42 = (Boolean) $r32;
            boolean $z03 = $r42.booleanValue();
            return $z03;
        }
        ClassWriter $r7 = super.f9987b;
        C4215g $r0 = $r7.getValue();
        C4162b3 $r8 = C4173c3.f10164y0;
        boolean $z04 = $r0.m28265a((String) null, $r8);
        boolean $z05 = $z04 ? "1".equals($r2) : Boolean.parseBoolean($r2);
        Boolean $r43 = Boolean.valueOf($z05);
        Object $r33 = c4162b3.m28406a($r43);
        Boolean $r44 = (Boolean) $r33;
        boolean $z06 = $r44.booleanValue();
        return $z06;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int add(String str, C4162b3 c4162b3, int i, int i2) {
        int $i2 = getValue(str, c4162b3);
        int $i1 = Math.min($i2, i2);
        int $i0 = Math.max($i1, i);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final String m28261b(String $r3, C4162b3 c4162b3) {
        if ($r3 == null) {
            Object $r4 = c4162b3.m28406a(null);
            return (String) $r4;
        }
        InterfaceC4204f $r2 = this.f10271b;
        String $r5 = c4162b3.m28405b();
        Object $r42 = c4162b3.m28406a($r2.mo27967e($r3, $r5));
        return (String) $r42;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final boolean m28263b() {
        Boolean $r1 = this.f10270a;
        if ($r1 == null) {
            Boolean $r12 = m28266a("app_measurement_lite");
            this.f10270a = $r12;
            if ($r12 == null) {
                Boolean $r13 = Boolean.FALSE;
                this.f10270a = $r13;
            }
        }
        Boolean $r14 = this.f10270a;
        boolean $z0 = $r14.booleanValue();
        if ($z0) {
            return true;
        }
        ClassWriter $r2 = super.f9987b;
        boolean $z02 = $r2.m28421l();
        return !$z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final boolean m28262b(String str) {
        InterfaceC4204f $r2 = this.f10271b;
        String $r1 = $r2.mo27967e(str, "measurement.event_sampling_enabled");
        boolean $z0 = "1".equals($r1);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final boolean m28260c(String str) {
        InterfaceC4204f $r2 = this.f10271b;
        String $r1 = $r2.mo27967e(str, "gaia_collection_enabled");
        boolean $z0 = "1".equals($r1);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final double m28258d(String str, C4162b3 c4162b3) {
        if (str == null) {
            Object $r4 = c4162b3.m28406a(null);
            Double $r5 = (Double) $r4;
            double $d0 = $r5.doubleValue();
            return $d0;
        }
        InterfaceC4204f $r6 = this.f10271b;
        String $r7 = c4162b3.m28405b();
        String $r3 = $r6.mo27967e(str, $r7);
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            Object $r42 = c4162b3.m28406a(null);
            Double $r52 = (Double) $r42;
            double $d02 = $r52.doubleValue();
            return $d02;
        }
        try {
            double $d03 = Double.parseDouble($r3);
            Double $r53 = Double.valueOf($d03);
            Object $r43 = c4162b3.m28406a($r53);
            Double $r54 = (Double) $r43;
            double $d04 = $r54.doubleValue();
            return $d04;
        } catch (NumberFormatException e) {
            Object $r44 = c4162b3.m28406a(null);
            Double $r55 = (Double) $r44;
            double $d05 = $r55.doubleValue();
            return $d05;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final int m28259d() {
        ClassWriter $r1 = super.f9987b;
        ByteVector $r2 = $r1.m28427b();
        ClassWriter $r12 = ((MethodWriter) $r2).f9987b;
        C4410w8 $r3 = $r12.m28422k();
        Boolean $r4 = $r3.m27874J();
        int $i0 = $r2.m28446b();
        if ($i0 < 201500) {
            if ($r4 != null) {
                boolean $z0 = $r4.booleanValue();
                return !$z0 ? 100 : 25;
            }
            return 25;
        }
        return 100;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m28257e() {
        ClassWriter $r1 = super.f9987b;
        $r1.newUTF8();
        return "FA";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final long m28256f() {
        ClassWriter $r1 = super.f9987b;
        $r1.newUTF8();
        return 46000L;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getItem() {
        String $r1 = m28264a("debug.deferred.deeplink", "");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getType() {
        String $r1 = m28264a("debug.firebase.analytics.app", "");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getValue(String str, C4162b3 c4162b3) {
        if (str == null) {
            Object $r4 = c4162b3.m28406a(null);
            Integer $r5 = (Integer) $r4;
            int $i0 = $r5.intValue();
            return $i0;
        }
        InterfaceC4204f $r6 = this.f10271b;
        String $r7 = c4162b3.m28405b();
        String $r3 = $r6.mo27967e(str, $r7);
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            Object $r42 = c4162b3.m28406a(null);
            Integer $r52 = (Integer) $r42;
            int $i02 = $r52.intValue();
            return $i02;
        }
        try {
            int $i03 = Integer.parseInt($r3);
            Integer $r53 = Integer.valueOf($i03);
            Object $r43 = c4162b3.m28406a($r53);
            Integer $r54 = (Integer) $r43;
            int $i04 = $r54.intValue();
            return $i04;
        } catch (NumberFormatException e) {
            Object $r44 = c4162b3.m28406a(null);
            Integer $r55 = (Integer) $r44;
            int $i05 = $r55.intValue();
            return $i05;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getValue(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.List.get(r0)
            android.os.Bundle r1 = r14.onCreateView()
            if (r1 != 0) goto L1c
            com.google.android.gms.measurement.internal.ClassWriter r2 = r14.f9987b
            com.google.android.gms.measurement.internal.Item r3 = r2.get()
            com.google.android.gms.measurement.internal.o3 r4 = r3.m28416b()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m28014a(r0)
        L1a:
            r5 = 0
            goto L2f
        L1c:
            java.lang.String r0 = "analytics.safelisted_events"
            boolean r6 = r1.containsKey(r0)
            if (r6 != 0) goto L25
            goto L1a
        L25:
            java.lang.String r0 = "analytics.safelisted_events"
            int r7 = r1.getInt(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
        L2f:
            if (r5 == 0) goto L5c
            com.google.android.gms.measurement.internal.ClassWriter r2 = r14.f9987b
            android.content.Context r8 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L4c
            android.content.res.Resources r9 = r8.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L4c
            int r7 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L4c
            java.lang.String[] r10 = r9.getStringArray(r7)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            if (r10 != 0) goto L47
            r11 = 0
            return r11
        L47:
            java.util.List r12 = java.util.Arrays.asList(r10)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            return r12
        L4c:
            r13 = move-exception
            com.google.android.gms.measurement.internal.ClassWriter r2 = r14.f9987b
            com.google.android.gms.measurement.internal.Item r3 = r2.get()
            com.google.android.gms.measurement.internal.o3 r4 = r3.m28416b()
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r4.m28013b(r0, r13)
        L5c:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4215g.getValue(java.lang.String):java.util.List");
    }

    final void initForMenu(InterfaceC4204f interfaceC4204f) {
        this.f10271b = interfaceC4204f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final int next(String str) {
        C4162b3 $r1 = C4173c3.f10096H;
        int $i0 = add(str, $r1, 500, 2000);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int onCreateView(String str) {
        C4162b3 $r1 = C4173c3.f10097I;
        int $i0 = add(str, $r1, 25, 100);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final Bundle onCreateView() {
        ClassWriter $r1 = super.f9987b;
        try {
            Context $r2 = $r1.getContext();
            PackageManager $r3 = $r2.getPackageManager();
            if ($r3 == null) {
                ClassWriter $r12 = super.f9987b;
                Item $r4 = $r12.get();
                C4312o3 $r5 = $r4.m28416b();
                $r5.m28014a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ClassWriter $r13 = super.f9987b;
            Context $r22 = $r13.getContext();
            C2955b $r6 = C2956c.m31548a($r22);
            ClassWriter $r14 = super.f9987b;
            Context $r23 = $r14.getContext();
            String $r7 = $r23.getPackageName();
            ApplicationInfo $r8 = $r6.m31553c($r7, 128);
            if ($r8 != null) {
                Bundle r10 = ((PackageItemInfo) $r8).metaData;
                return r10;
            }
            ClassWriter $r15 = super.f9987b;
            Item $r42 = $r15.get();
            C4312o3 $r52 = $r42.m28416b();
            $r52.m28014a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException $r9) {
            ClassWriter $r16 = super.f9987b;
            Item $r43 = $r16.get();
            C4312o3 $r53 = $r43.m28416b();
            $r53.m28013b("Failed to load metadata: Package name not found", $r9);
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean onItemClick() {
        Boolean $r1 = m28266a("google_analytics_automatic_screen_reporting_enabled");
        if ($r1 != null) {
            boolean $z0 = $r1.booleanValue();
            return $z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean put() {
        ClassWriter $r1 = super.f9987b;
        $r1.newUTF8();
        Boolean $r2 = m28266a("firebase_analytics_collection_deactivated");
        if ($r2 != null) {
            boolean $z0 = $r2.booleanValue();
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set() {
        Boolean $r1 = m28266a("google_analytics_adid_collection_enabled");
        if ($r1 != null) {
            boolean $z0 = $r1.booleanValue();
            return $z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long write(String str, C4162b3 c4162b3) {
        if (str == null) {
            Object $r4 = c4162b3.m28406a(null);
            Long $r5 = (Long) $r4;
            long $l0 = $r5.longValue();
            return $l0;
        }
        InterfaceC4204f $r6 = this.f10271b;
        String $r7 = c4162b3.m28405b();
        String $r3 = $r6.mo27967e(str, $r7);
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            Object $r42 = c4162b3.m28406a(null);
            Long $r52 = (Long) $r42;
            long $l02 = $r52.longValue();
            return $l02;
        }
        try {
            long $l03 = Long.parseLong($r3);
            Long $r53 = Long.valueOf($l03);
            Object $r43 = c4162b3.m28406a($r53);
            Long $r54 = (Long) $r43;
            long $l04 = $r54.longValue();
            return $l04;
        } catch (NumberFormatException e) {
            Object $r44 = c4162b3.m28406a(null);
            Long $r55 = (Long) $r44;
            long $l05 = $r55.longValue();
            return $l05;
        }
    }
}
