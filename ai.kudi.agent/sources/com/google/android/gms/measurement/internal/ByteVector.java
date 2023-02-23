package com.google.android.gms.measurement.internal;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.internal.List;
import com.google.android.gms.common.p102o.C2955b;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2968f;
import com.google.android.gms.common.util.InterfaceC2967e;
import com.google.android.gms.internal.measurement.C3710ad;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class ByteVector extends Label {
    private static final String[] list;

    /* renamed from: n */
    public static final /* synthetic */ int f9940n = 0;

    /* renamed from: s */
    private static final String[] f9941s;

    /* renamed from: a */
    private Integer f9942a;

    /* renamed from: b */
    private int f9943b;

    /* renamed from: c */
    private final AtomicLong f9944c;
    private SecureRandom length;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        String[] $r0 = {"firebase_", "google_", "ga_"};
        f9941s = $r0;
        String[] $r02 = {"_err"};
        list = $r02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ByteVector(ClassWriter classWriter) {
        super(classWriter);
        this.f9942a = null;
        AtomicLong $r2 = new AtomicLong(0L);
        this.f9944c = $r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static long m28447a(byte[] bArr) {
        List.m31820a(bArr);
        int $i0 = bArr.length;
        int $i1 = 0;
        boolean $z0 = $i0 > 0;
        List.setId($z0);
        long $l2 = 0;
        for (int $i02 = $i0 - 1; $i02 >= 0; $i02--) {
            int $i3 = bArr.length;
            if ($i02 < $i3 - 8) {
                break;
            }
            byte $b4 = bArr[$i02];
            long $l5 = $b4;
            $l2 += ($l5 & 255) << $i1;
            $i1 += 8;
        }
        return $l2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Object m28474a(int $i0, Object obj, boolean $z0, boolean z) {
        if (obj == null) {
            return null;
        }
        boolean $z2 = obj instanceof Long;
        if ($z2) {
            return obj;
        }
        boolean $z22 = obj instanceof Double;
        if ($z22) {
            return obj;
        }
        boolean $z23 = obj instanceof Integer;
        if ($z23) {
            Integer $r2 = (Integer) obj;
            int $i02 = $r2.intValue();
            long $l1 = $i02;
            Long $r3 = Long.valueOf($l1);
            return $r3;
        }
        boolean $z24 = obj instanceof Byte;
        if ($z24) {
            Byte $r4 = (Byte) obj;
            byte $b2 = $r4.byteValue();
            long $l12 = $b2;
            Long $r32 = Long.valueOf($l12);
            return $r32;
        }
        boolean $z25 = obj instanceof Short;
        if ($z25) {
            Short $r5 = (Short) obj;
            short $s3 = $r5.shortValue();
            long $l13 = $s3;
            Long $r33 = Long.valueOf($l13);
            return $r33;
        }
        boolean $z26 = obj instanceof Boolean;
        if ($z26) {
            Boolean $r6 = (Boolean) obj;
            boolean $z02 = $r6.booleanValue();
            long $l14 = true != $z02 ? 0L : 1L;
            Long $r34 = Long.valueOf($l14);
            return $r34;
        }
        boolean $z27 = obj instanceof Float;
        if ($z27) {
            Float $r7 = (Float) obj;
            double $d0 = $r7.doubleValue();
            Double $r8 = Double.valueOf($d0);
            return $r8;
        }
        boolean $z28 = obj instanceof String;
        if (!$z28) {
            boolean $z29 = obj instanceof Character;
            if (!$z29) {
                boolean $z210 = obj instanceof CharSequence;
                if (!$z210) {
                    if (z) {
                        boolean $z03 = obj instanceof Bundle[];
                        if (!$z03) {
                            boolean $z04 = obj instanceof Parcelable[];
                            if (!$z04) {
                                return null;
                            }
                        }
                        ArrayList $r9 = new ArrayList();
                        Parcelable[] $r10 = (Parcelable[]) obj;
                        for (Parcelable $r11 : $r10) {
                            boolean $z05 = $r11 instanceof Bundle;
                            if ($z05) {
                                Bundle $r12 = m28470a((Bundle) $r11);
                                boolean $z06 = $r12.isEmpty();
                                if (!$z06) {
                                    $r9.add($r12);
                                }
                            }
                        }
                        int $i03 = $r9.size();
                        Bundle[] $r13 = new Bundle[$i03];
                        Object[] $r14 = $r9.toArray($r13);
                        return $r14;
                    }
                    return null;
                }
            }
        }
        String $r15 = obj.toString();
        return getValue($r15, $i0, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m28448a(java.util.List r18) {
        /*
            if (r18 != 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 0
            r1.<init>(r2)
            return r1
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = r18
            int r3 = r0.size()
            r1.<init>(r3)
            r0 = r18
            java.util.Iterator r4 = r0.iterator()
        L1a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lde
            java.lang.Object r6 = r4.next()
            r8 = r6
            com.google.android.gms.measurement.internal.c r8 = (com.google.android.gms.measurement.internal.C4169c) r8
            r7 = r8
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = r7.f10077c
            java.lang.String r11 = "app_id"
            r9.putString(r11, r10)
            java.lang.String r10 = r7.f10078d
            java.lang.String r11 = "origin"
            r9.putString(r11, r10)
            long r12 = r7.f10080f
            java.lang.String r11 = "creation_timestamp"
            r9.putLong(r11, r12)
            com.google.android.gms.measurement.internal.ea r14 = r7.f10079e
            java.lang.String r10 = r14.f10245d
            java.lang.String r11 = "name"
            r9.putString(r11, r10)
            com.google.android.gms.measurement.internal.ea r14 = r7.f10079e
            java.lang.Object r6 = r14.m28270f()
            com.google.android.gms.common.internal.List.m31820a(r6)
            com.google.android.gms.measurement.internal.C4430y5.m27808b(r9, r6)
            boolean r5 = r7.f10081w
            java.lang.String r11 = "active"
            r9.putBoolean(r11, r5)
            java.lang.String r10 = r7.f10082x
            if (r10 == 0) goto L67
            java.lang.String r11 = "trigger_event_name"
            r9.putString(r11, r10)
        L67:
            com.google.android.gms.measurement.internal.u r15 = r7.f10083y
            if (r15 == 0) goto L85
            java.lang.String r10 = r15.f10698c
            java.lang.String r11 = "timed_out_event_name"
            r9.putString(r11, r10)
            com.google.android.gms.measurement.internal.s r0 = r15.f10699d
            r16 = r0
            if (r16 == 0) goto L85
            r0 = r16
            android.os.Bundle r17 = r0.m27977k()
            java.lang.String r11 = "timed_out_event_params"
            r0 = r17
            r9.putBundle(r11, r0)
        L85:
            long r12 = r7.f10084z
            java.lang.String r11 = "trigger_timeout"
            r9.putLong(r11, r12)
            com.google.android.gms.measurement.internal.u r15 = r7.f10074A
            if (r15 == 0) goto Laa
            java.lang.String r10 = r15.f10698c
            java.lang.String r11 = "triggered_event_name"
            r9.putString(r11, r10)
            com.google.android.gms.measurement.internal.s r0 = r15.f10699d
            r16 = r0
            if (r16 == 0) goto Laa
            r0 = r16
            android.os.Bundle r17 = r0.m27977k()
            java.lang.String r11 = "triggered_event_params"
            r0 = r17
            r9.putBundle(r11, r0)
        Laa:
            com.google.android.gms.measurement.internal.ea r14 = r7.f10079e
            long r12 = r14.f10246e
            java.lang.String r11 = "triggered_timestamp"
            r9.putLong(r11, r12)
            long r12 = r7.f10075B
            java.lang.String r11 = "time_to_live"
            r9.putLong(r11, r12)
            com.google.android.gms.measurement.internal.u r15 = r7.f10076C
            if (r15 == 0) goto Ld8
            java.lang.String r10 = r15.f10698c
            java.lang.String r11 = "expired_event_name"
            r9.putString(r11, r10)
            com.google.android.gms.measurement.internal.s r0 = r15.f10699d
            r16 = r0
            if (r16 == 0) goto Ld8
            r0 = r16
            android.os.Bundle r17 = r0.m27977k()
            java.lang.String r11 = "expired_event_params"
            r0 = r17
            r9.putBundle(r11, r0)
        Ld8:
            r1.add(r9)
            goto L1a
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28448a(java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static void m28462a(C4328p7 c4328p7, Bundle bundle, boolean $z1) {
        if (bundle != null && c4328p7 != null) {
            boolean $z0 = bundle.containsKey("_sc");
            if (!$z0 || $z1) {
                String $r2 = c4328p7.f10582a;
                if ($r2 != null) {
                    bundle.putString("_sn", $r2);
                } else {
                    bundle.remove("_sn");
                }
                String $r22 = c4328p7.f10583b;
                if ($r22 != null) {
                    bundle.putString("_sc", $r22);
                } else {
                    bundle.remove("_sc");
                }
                long $l0 = c4328p7.f10584c;
                bundle.putLong("_si", $l0);
                return;
            }
            $z1 = false;
        }
        if (bundle != null && c4328p7 == null && $z1) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static boolean m28471a(Context context, boolean z) {
        List.m31820a(context);
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            boolean $z0 = get(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            return $z0;
        }
        boolean $z02 = get(context, "com.google.android.gms.measurement.AppMeasurementService");
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private static boolean m28450a(String str, String[] strArr) {
        List.m31820a(strArr);
        for (String $r2 : strArr) {
            boolean $z0 = get(str, $r2);
            if ($z0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static final boolean accept(String str) {
        List.m31820a(str);
        boolean $z0 = str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static final boolean add(Bundle bundle, int i) {
        long $l2 = bundle.getLong("_err");
        if ($l2 == 0) {
            long $l22 = i;
            bundle.putLong("_err", $l22);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MessageDigest doInBackground() {
        MessageDigest $r0;
        for (int $i0 = 0; $i0 < 2; $i0++) {
            try {
                $r0 = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
            }
            if ($r0 != null) {
                return $r0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static boolean get(Context context) {
        List.m31820a(context);
        try {
            PackageManager $r3 = context.getPackageManager();
            if ($r3 == null) {
                return false;
            }
            ComponentName $r0 = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver");
            ActivityInfo $r4 = $r3.getReceiverInfo($r0, 0);
            if ($r4 != null) {
                boolean $z0 = ((ComponentInfo) $r4).enabled;
                return $z0;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static boolean get(Context context, String str) {
        try {
            PackageManager $r4 = context.getPackageManager();
            if ($r4 == null) {
                return false;
            }
            ComponentName $r1 = new ComponentName(context, str);
            ServiceInfo $r5 = $r4.getServiceInfo($r1, 0);
            if ($r5 != null) {
                boolean $z0 = ((ComponentInfo) $r5).enabled;
                return $z0;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static boolean get(String str) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            return false;
        }
        boolean $z02 = str.startsWith("_");
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static boolean get(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        boolean $z0 = str.equals(str2);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static boolean put(String str) {
        String[] $r1 = list;
        String $r2 = $r1[0];
        boolean $z0 = $r2.equals(str);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int read(String str) {
        boolean $z0 = "_ldl".equals(str);
        if ($z0) {
            ClassWriter $r4 = ((MethodWriter) this).f9987b;
            $r4.getValue();
            return IjkMediaMeta.FF_PROFILE_H264_INTRA;
        }
        boolean $z02 = "_id".equals(str);
        if ($z02) {
            ClassWriter $r42 = ((MethodWriter) this).f9987b;
            $r42.getValue();
            return 256;
        }
        ClassWriter $r43 = ((MethodWriter) this).f9987b;
        C4215g $r5 = $r43.getValue();
        C4162b3 $r1 = C4173c3.f10120c0;
        boolean $z03 = $r5.m28265a((String) null, $r1);
        if ($z03) {
            boolean $z04 = "_lgclid".equals(str);
            if ($z04) {
                ClassWriter $r44 = ((MethodWriter) this).f9987b;
                $r44.getValue();
                return 100;
            }
        }
        ClassWriter $r45 = ((MethodWriter) this).f9987b;
        $r45.getValue();
        return 36;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static boolean write(String str) {
        List.get(str);
        char $c0 = str.charAt(0);
        if ($c0 == '_') {
            boolean $z0 = str.equals("_ep");
            return $z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final int m28475a(int i) {
        C2834f $r1 = C2834f.m31847f();
        ClassWriter $r2 = ((MethodWriter) this).f9987b;
        Context $r3 = $r2.getContext();
        int $i0 = $r1.mo31845h($r3, C2838h.f7921a);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
        if (r7 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int m28452a(java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.Object r54, android.os.Bundle r55, java.util.List r56, boolean r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28452a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0013 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.os.Bundle m28470a(android.os.Bundle r13) {
        /*
            r12 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r13 == 0) goto L45
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r2 = r1.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            java.lang.Object r4 = r13.get(r5)
            java.lang.Object r4 = r12.m28439b(r5, r4)
            if (r4 != 0) goto L41
            com.google.android.gms.measurement.internal.ClassWriter r7 = r12.f9987b
            com.google.android.gms.measurement.internal.Item r8 = r7.get()
            com.google.android.gms.measurement.internal.o3 r9 = r8.getValue()
            com.google.android.gms.measurement.internal.ClassWriter r7 = r12.f9987b
            com.google.android.gms.measurement.internal.l3 r10 = r7.visitAnnotation()
            java.lang.String r5 = r10.m28045e(r5)
            java.lang.String r11 = "Param value can't be null"
            r9.m28013b(r11, r5)
            goto Lf
        L41:
            r12.m28468a(r0, r5, r4)
            goto Lf
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28470a(android.os.Bundle):android.os.Bundle");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0036 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0030 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.os.Bundle m28455a(java.lang.String r36, java.lang.String r37, android.os.Bundle r38, java.util.List r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28455a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final C4379u m28456a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        boolean $z1 = TextUtils.isEmpty(str2);
        if ($z1) {
            return null;
        }
        int $i1 = add(str2);
        if ($i1 != 0) {
            ClassWriter $r9 = ((MethodWriter) this).f9987b;
            Item $r10 = $r9.get();
            C4312o3 $r11 = $r10.m28416b();
            ClassWriter $r92 = ((MethodWriter) this).f9987b;
            C4276l3 $r12 = $r92.visitAnnotation();
            String $r2 = $r12.m28044f(str2);
            $r11.m28013b("Invalid conditional property event name", $r2);
            IllegalArgumentException $r13 = new IllegalArgumentException();
            throw $r13;
        }
        Bundle $r5 = bundle != null ? new Bundle(bundle) : new Bundle();
        $r5.putString("_o", str3);
        java.util.List $r6 = C2968f.m31538b("_o");
        Bundle $r4 = m28455a(str, str2, $r5, $r6, true);
        Bundle $r52 = $r4;
        if (z) {
            $r52 = m28470a($r4);
        }
        List.m31820a($r52);
        C4355s $r8 = new C4355s($r52);
        C4379u $r7 = new C4379u(str2, $r8, str3, j);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final Object m28458a(String str, Object $r1) {
        boolean $z0 = "_ldl".equals(str);
        if ($z0) {
            int $i0 = read(str);
            return m28474a($i0, $r1, true, false);
        }
        int $i02 = read(str);
        return m28474a($i02, $r1, false, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final URL m28473a(long j, String str, String str2, long j2) {
        try {
            List.get(str2);
            List.get(str);
            Object[] $r3 = new Object[4];
            Object[] $r4 = new Object[2];
            $r4[0] = 46000L;
            int $i2 = m28446b();
            Integer $r6 = Integer.valueOf($i2);
            $r4[1] = $r6;
            String $r7 = String.format("v%s.%s", $r4);
            $r3[0] = $r7;
            $r3[1] = str2;
            $r3[2] = str;
            Long $r5 = Long.valueOf(j2);
            $r3[3] = $r5;
            String $r2 = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", $r3);
            String $r72 = $r2;
            ClassWriter $r8 = ((MethodWriter) this).f9987b;
            C4215g $r9 = $r8.getValue();
            String $r10 = $r9.getItem();
            boolean $z0 = str.equals($r10);
            if ($z0) {
                String $r1 = $r2.concat("&ddl_test=1");
                $r72 = $r1;
            }
            URL r15 = new URL($r72);
            return r15;
        } catch (IllegalArgumentException | MalformedURLException $r12) {
            ClassWriter $r82 = ((MethodWriter) this).f9987b;
            Item $r13 = $r82.get();
            C4312o3 $r14 = $r13.m28416b();
            Exception r16 = (Exception) $r12;
            String $r15 = r16.getMessage();
            $r14.m28013b("Failed to create BOW URL for Deferred Deep Link. exception", $r15);
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.Label
    /* renamed from: a */
    protected final void mo28323a() {
        putShort();
        SecureRandom $r1 = new SecureRandom();
        long $l1 = $r1.nextLong();
        long $l2 = $l1;
        if ($l1 == 0) {
            long $l12 = $r1.nextLong();
            $l2 = $l12;
            if ($l12 == 0) {
                ClassWriter $r2 = ((MethodWriter) this).f9987b;
                Item $r3 = $r2.get();
                C4312o3 $r4 = $r3.clear();
                $r4.m28014a("Utils falling back to Random for random id");
            }
        }
        AtomicLong $r5 = this.f9944c;
        $r5.set($l2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final void m28469a(Bundle bundle, long j) {
        long $l1 = bundle.getLong("_et");
        long $l2 = $l1;
        if ($l1 != 0) {
            ClassWriter $r2 = ((MethodWriter) this).f9987b;
            Item $r3 = $r2.get();
            C4312o3 $r4 = $r3.clear();
            Long $r5 = Long.valueOf($l1);
            $r4.m28013b("Params already contained engagement", $r5);
        } else {
            $l2 = 0;
        }
        long $l0 = j + $l2;
        bundle.putLong("_et", $l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final void m28468a(Bundle bundle, String str, Object obj) {
        String $r5;
        if (bundle == null) {
            return;
        }
        boolean $z0 = obj instanceof Long;
        if ($z0) {
            Long $r4 = (Long) obj;
            long $l0 = $r4.longValue();
            bundle.putLong(str, $l0);
            return;
        }
        boolean $z02 = obj instanceof String;
        if ($z02) {
            String $r52 = String.valueOf(obj);
            bundle.putString(str, $r52);
            return;
        }
        boolean $z03 = obj instanceof Double;
        if ($z03) {
            Double $r6 = (Double) obj;
            double $d0 = $r6.doubleValue();
            bundle.putDouble(str, $d0);
            return;
        }
        boolean $z04 = obj instanceof Bundle[];
        if ($z04) {
            Bundle[] $r7 = (Bundle[]) obj;
            bundle.putParcelableArray(str, $r7);
        } else if (str != null) {
            if (obj != null) {
                Class $r8 = obj.getClass();
                $r5 = $r8.getSimpleName();
            } else {
                $r5 = null;
            }
            ClassWriter $r9 = ((MethodWriter) this).f9987b;
            Item $r10 = $r9.get();
            C4312o3 $r11 = $r10.getValue();
            ClassWriter $r92 = ((MethodWriter) this).f9987b;
            C4276l3 $r12 = $r92.visitAnnotation();
            String $r2 = $r12.m28045e(str);
            $r11.m28012c("Not putting event parameter. Invalid value type. name, type", $r2, $r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m28467a(InterfaceC3824i1 interfaceC3824i1, int i) {
        Bundle $r2 = new Bundle();
        $r2.putInt("r", i);
        try {
            interfaceC3824i1.mo29532l($r2);
        } catch (RemoteException $r3) {
            ClassWriter $r4 = ((MethodWriter) this).f9987b;
            Item $r5 = $r4.get();
            C4312o3 $r6 = $r5.clear();
            $r6.m28013b("Error returning int value to wrapper", $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m28466a(InterfaceC3824i1 interfaceC3824i1, long j) {
        Bundle $r1 = new Bundle();
        $r1.putLong("r", j);
        try {
            interfaceC3824i1.mo29532l($r1);
        } catch (RemoteException $r3) {
            ClassWriter $r4 = ((MethodWriter) this).f9987b;
            Item $r5 = $r4.get();
            C4312o3 $r6 = $r5.clear();
            $r6.m28013b("Error returning long value to wrapper", $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m28465a(InterfaceC3824i1 interfaceC3824i1, ArrayList arrayList) {
        Bundle $r3 = new Bundle();
        $r3.putParcelableArrayList("r", arrayList);
        try {
            interfaceC3824i1.mo29532l($r3);
        } catch (RemoteException $r4) {
            ClassWriter $r5 = ((MethodWriter) this).f9987b;
            Item $r6 = $r5.get();
            C4312o3 $r7 = $r6.clear();
            $r7.m28013b("Error returning bundle list to wrapper", $r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m28464a(InterfaceC3824i1 interfaceC3824i1, byte[] bArr) {
        Bundle $r3 = new Bundle();
        $r3.putByteArray("r", bArr);
        try {
            interfaceC3824i1.mo29532l($r3);
        } catch (RemoteException $r4) {
            ClassWriter $r5 = ((MethodWriter) this).f9987b;
            Item $r6 = $r5.get();
            C4312o3 $r7 = $r6.clear();
            $r7.m28013b("Error returning byte array to wrapper", $r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final void m28463a(InterfaceC4236ha interfaceC4236ha, String str, int i, String str2, String str3, int i2) {
        Bundle $r3 = new Bundle();
        add($r3, i);
        boolean $z0 = TextUtils.isEmpty(str2);
        if (!$z0) {
            boolean $z02 = TextUtils.isEmpty(str3);
            if (!$z02) {
                $r3.putString(str2, str3);
            }
        }
        if (i == 6 || i == 7 || i == 2) {
            long $l2 = i2;
            $r3.putLong("_el", $l2);
        }
        interfaceC4236ha.mo27807a(str, "_err", $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m28461a(com.google.android.gms.measurement.internal.C4347r3 r24, int r25) {
        /*
            r23 = this;
            java.util.TreeSet r4 = new java.util.TreeSet
            r0 = r24
            android.os.Bundle r5 = r0.f10634d
            java.util.Set r6 = r5.keySet()
            r4.<init>(r6)
            java.util.Iterator r7 = r4.iterator()
            r8 = 0
        L12:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r10 = r7.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            r11 = r12
            boolean r9 = write(r11)
            if (r9 == 0) goto L12
            int r8 = r8 + 1
            r0 = r25
            if (r8 <= r0) goto L12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 48
            r13.<init>(r14)
            java.lang.String r15 = "Event can't contain more than "
            r13.append(r15)
            r0 = r25
            r13.append(r0)
            java.lang.String r15 = " params"
            r13.append(r15)
            r0 = r23
            com.google.android.gms.measurement.internal.ClassWriter r0 = r0.f9987b
            r16 = r0
            com.google.android.gms.measurement.internal.Item r17 = r0.get()
            r0 = r17
            com.google.android.gms.measurement.internal.o3 r18 = r0.m28414g()
            java.lang.String r19 = r13.toString()
            r0 = r23
            com.google.android.gms.measurement.internal.ClassWriter r0 = r0.f9987b
            r16 = r0
            com.google.android.gms.measurement.internal.l3 r20 = r0.visitAnnotation()
            r0 = r24
            java.lang.String r0 = r0.f10631a
            r21 = r0
            r0 = r20
            r1 = r21
            java.lang.String r21 = r0.m28046d(r1)
            r0 = r23
            com.google.android.gms.measurement.internal.ClassWriter r0 = r0.f9987b
            r16 = r0
            com.google.android.gms.measurement.internal.l3 r20 = r0.visitAnnotation()
            r0 = r24
            android.os.Bundle r5 = r0.f10634d
            r0 = r20
            java.lang.String r22 = r0.m28048b(r5)
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            r0.m28012c(r1, r2, r3)
            r0 = r24
            android.os.Bundle r5 = r0.f10634d
            r14 = 5
            add(r5, r14)
            r0 = r24
            android.os.Bundle r5 = r0.f10634d
            r5.remove(r11)
            goto L12
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28461a(com.google.android.gms.measurement.internal.r3, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001e */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m28453a(java.lang.String r28, java.lang.String r29, java.lang.String r30, android.os.Bundle r31, java.util.List r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28453a(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28472a(Context context, String str) {
        X500Principal $r3 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            C2955b $r4 = C2956c.m31548a(context);
            PackageInfo $r5 = $r4.m31551e(str, 64);
            if ($r5 != null) {
                Signature[] $r6 = $r5.signatures;
                if ($r6 != null) {
                    Signature[] $r62 = $r5.signatures;
                    int $i0 = $r62.length;
                    if ($i0 > 0) {
                        Signature[] $r63 = $r5.signatures;
                        Signature $r7 = $r63[0];
                        CertificateFactory $r8 = CertificateFactory.getInstance("X.509");
                        byte[] $r10 = $r7.toByteArray();
                        ByteArrayInputStream $r9 = new ByteArrayInputStream($r10);
                        Certificate $r11 = $r8.generateCertificate($r9);
                        X509Certificate $r12 = (X509Certificate) $r11;
                        X500Principal $r13 = $r12.getSubjectX500Principal();
                        boolean $z0 = $r13.equals($r3);
                        return $z0;
                    }
                    return true;
                }
                return true;
            }
            return true;
        } catch (PackageManager.NameNotFoundException $r14) {
            ClassWriter $r15 = ((MethodWriter) this).f9987b;
            Item $r16 = $r15.get();
            C4312o3 $r17 = $r16.m28416b();
            $r17.m28013b("Package name not found", $r14);
            return true;
        } catch (CertificateException $r18) {
            ClassWriter $r152 = ((MethodWriter) this).f9987b;
            Item $r162 = $r152.get();
            C4312o3 $r172 = $r162.m28416b();
            $r172.m28013b("Error obtaining certificate", $r18);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28460a(String str) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            return false;
        }
        ClassWriter $r1 = ((MethodWriter) this).f9987b;
        C4215g $r3 = $r1.getValue();
        String $r4 = $r3.getType();
        ClassWriter $r12 = ((MethodWriter) this).f9987b;
        $r12.newUTF8();
        boolean $z02 = $r4.equals(str);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final boolean m28459a(String str, int i, String str2) {
        if (str2 == null) {
            ClassWriter $r3 = ((MethodWriter) this).f9987b;
            Item $r4 = $r3.get();
            C4312o3 $r5 = $r4.m28414g();
            $r5.m28013b("Name is required and can't be null. Type", str);
            return false;
        }
        int $i1 = str2.length();
        if (str2.codePointCount(0, $i1) > i) {
            ClassWriter $r32 = ((MethodWriter) this).f9987b;
            Item $r42 = $r32.get();
            C4312o3 $r52 = $r42.m28414g();
            Integer $r6 = Integer.valueOf(i);
            $r52.m28011d("Name is too long. Type, maximum supported length, name", str, $r6, str2);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28457a(String str, String str2) {
        if (str2 == null) {
            ClassWriter $r3 = ((MethodWriter) this).f9987b;
            Item $r4 = $r3.get();
            C4312o3 $r5 = $r4.m28414g();
            $r5.m28013b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            ClassWriter $r32 = ((MethodWriter) this).f9987b;
            Item $r42 = $r32.get();
            C4312o3 $r52 = $r42.m28414g();
            $r52.m28013b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int $i0 = str2.codePointAt(0);
            int $i1 = $i0;
            boolean $z0 = Character.isLetter($i0);
            if (!$z0) {
                if ($i0 != 95) {
                    ClassWriter $r33 = ((MethodWriter) this).f9987b;
                    Item $r43 = $r33.get();
                    C4312o3 $r53 = $r43.m28414g();
                    $r53.m28012c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                $i1 = 95;
            }
            int $i02 = str2.length();
            int $i12 = Character.charCount($i1);
            while ($i12 < $i02) {
                int $i2 = str2.codePointAt($i12);
                if ($i2 != 95) {
                    boolean $z02 = Character.isLetterOrDigit($i2);
                    if (!$z02) {
                        ClassWriter $r34 = ((MethodWriter) this).f9987b;
                        Item $r44 = $r34.get();
                        C4312o3 $r54 = $r44.m28414g();
                        $r54.m28012c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                $i12 += Character.charCount($i2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28454a(String str, String str2, String str3) {
        boolean $z0 = TextUtils.isEmpty(str);
        if (!$z0) {
            boolean $z02 = accept(str);
            if ($z02) {
                return true;
            }
            ClassWriter $r5 = ((MethodWriter) this).f9987b;
            boolean $z03 = $r5.equals();
            if ($z03) {
                ClassWriter $r52 = ((MethodWriter) this).f9987b;
                Item $r6 = $r52.get();
                C4312o3 $r7 = $r6.m28414g();
                Object $r8 = Item.toString(str);
                $r7.m28013b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", $r8);
                return false;
            }
            return false;
        }
        C3710ad.m29843b();
        ClassWriter $r53 = ((MethodWriter) this).f9987b;
        C4215g $r9 = $r53.getValue();
        C4162b3 $r1 = C4173c3.f10122d0;
        boolean $z04 = $r9.m28265a((String) null, $r1);
        if ($z04) {
            boolean $z05 = TextUtils.isEmpty(str3);
            if (!$z05) {
                return true;
            }
        }
        boolean $z06 = TextUtils.isEmpty(str2);
        if ($z06) {
            ClassWriter $r54 = ((MethodWriter) this).f9987b;
            boolean $z07 = $r54.equals();
            if ($z07) {
                ClassWriter $r55 = ((MethodWriter) this).f9987b;
                Item $r62 = $r55.get();
                C4312o3 $r72 = $r62.m28414g();
                $r72.m28014a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
            return false;
        }
        boolean $z08 = accept(str2);
        if ($z08) {
            return true;
        }
        ClassWriter $r56 = ((MethodWriter) this).f9987b;
        Item $r63 = $r56.get();
        C4312o3 $r73 = $r63.m28414g();
        Object $r82 = Item.toString(str2);
        $r73.m28013b("Invalid admob_app_id. Analytics disabled.", $r82);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m28451a(String str, String str2, String str3, String str4) {
        boolean $z0 = TextUtils.isEmpty(str);
        boolean $z1 = TextUtils.isEmpty(str2);
        if (!$z0 && !$z1) {
            List.m31820a(str);
            return !str.equals(str2);
        } else if ($z0 && $z1) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if ($z0) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final boolean m28449a(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            ClassWriter $r6 = ((MethodWriter) this).f9987b;
            Item $r7 = $r6.get();
            C4312o3 $r8 = $r7.m28414g();
            $r8.m28013b("Name is required and can't be null. Type", str);
            return false;
        }
        List.m31820a(str2);
        String[] $r2 = f9941s;
        for (int $i0 = 0; $i0 < 3; $i0++) {
            String $r9 = $r2[$i0];
            boolean $z0 = str2.startsWith($r9);
            if ($z0) {
                ClassWriter $r62 = ((MethodWriter) this).f9987b;
                Item $r72 = $r62.get();
                C4312o3 $r82 = $r72.m28414g();
                $r82.m28012c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null) {
            boolean $z02 = m28450a(str2, strArr);
            if ($z02) {
                if (strArr2 != null) {
                    boolean $z03 = m28450a(str2, strArr2);
                    if ($z03) {
                        return true;
                    }
                }
                ClassWriter $r63 = ((MethodWriter) this).f9987b;
                Item $r73 = $r63.get();
                C4312o3 $r83 = $r73.m28414g();
                $r83.m28012c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final int add(String str) {
        boolean $z0 = m28457a("event", str);
        if ($z0) {
            String[] $r3 = C4441z5.f10854a;
            String[] $r1 = C4441z5.f10855b;
            boolean $z02 = m28449a("event", $r3, $r1, str);
            if ($z02) {
                ClassWriter $r4 = ((MethodWriter) this).f9987b;
                $r4.getValue();
                boolean $z03 = m28459a("event", 40, str);
                return !$z03 ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long add(long j, long j2) {
        long $l1 = j2 * 60000;
        long $l0 = j + $l1;
        return $l0 / 86400000;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final int m28446b() {
        Integer $r1 = this.f9942a;
        if ($r1 == null) {
            C2834f $r2 = C2834f.m31847f();
            ClassWriter $r3 = ((MethodWriter) this).f9987b;
            Context $r4 = $r3.getContext();
            int $i0 = $r2.m31852a($r4);
            Integer $r12 = Integer.valueOf($i0 / 1000);
            this.f9942a = $r12;
        }
        Integer $r13 = this.f9942a;
        int $i02 = $r13.intValue();
        return $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    final int m28440b(String str) {
        boolean $z0 = m28457a("event param", str);
        if ($z0) {
            boolean $z02 = m28449a("event param", (String[]) null, (String[]) null, str);
            if ($z02) {
                ClassWriter $r2 = ((MethodWriter) this).f9987b;
                $r2.getValue();
                boolean $z03 = m28459a("event param", 40, str);
                return !$z03 ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    final Bundle m28445b(Uri uri) {
        String $r2;
        String $r3;
        String $r4;
        String $r5;
        if (uri != null) {
            try {
                boolean $z0 = uri.isHierarchical();
                if ($z0) {
                    $r2 = uri.getQueryParameter("utm_campaign");
                    $r3 = uri.getQueryParameter("utm_source");
                    $r4 = uri.getQueryParameter("utm_medium");
                    $r5 = uri.getQueryParameter("gclid");
                } else {
                    $r2 = null;
                    $r3 = null;
                    $r4 = null;
                    $r5 = null;
                }
                boolean $z02 = TextUtils.isEmpty($r2);
                if ($z02) {
                    boolean $z03 = TextUtils.isEmpty($r3);
                    if ($z03) {
                        boolean $z04 = TextUtils.isEmpty($r4);
                        if ($z04) {
                            boolean $z05 = TextUtils.isEmpty($r5);
                            if ($z05) {
                                return null;
                            }
                        }
                    }
                }
                Bundle $r6 = new Bundle();
                boolean $z06 = TextUtils.isEmpty($r2);
                if (!$z06) {
                    $r6.putString("campaign", $r2);
                }
                boolean $z07 = TextUtils.isEmpty($r3);
                if (!$z07) {
                    $r6.putString(TransactionField.TRANSACTION_CHANNEL, $r3);
                }
                boolean $z08 = TextUtils.isEmpty($r4);
                if (!$z08) {
                    $r6.putString("medium", $r4);
                }
                boolean $z09 = TextUtils.isEmpty($r5);
                if (!$z09) {
                    $r6.putString("gclid", $r5);
                }
                String $r22 = uri.getQueryParameter("utm_term");
                boolean $z010 = TextUtils.isEmpty($r22);
                if (!$z010) {
                    $r6.putString("term", $r22);
                }
                String $r23 = uri.getQueryParameter("utm_content");
                boolean $z011 = TextUtils.isEmpty($r23);
                if (!$z011) {
                    $r6.putString("content", $r23);
                }
                String $r24 = uri.getQueryParameter("aclid");
                boolean $z012 = TextUtils.isEmpty($r24);
                if (!$z012) {
                    $r6.putString("aclid", $r24);
                }
                String $r25 = uri.getQueryParameter("cp1");
                boolean $z013 = TextUtils.isEmpty($r25);
                if (!$z013) {
                    $r6.putString("cp1", $r25);
                }
                String $r26 = uri.getQueryParameter("anid");
                boolean $z014 = TextUtils.isEmpty($r26);
                if ($z014) {
                    return $r6;
                }
                $r6.putString("anid", $r26);
                return $r6;
            } catch (UnsupportedOperationException $r7) {
                ClassWriter $r8 = ((MethodWriter) this).f9987b;
                Item $r9 = $r8.get();
                C4312o3 $r10 = $r9.clear();
                $r10.m28013b("Install referrer url isn't a hierarchical URI", $r7);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    final Object m28439b(String str, Object $r1) {
        boolean $z0 = "_ev".equals(str);
        short $s0 = 256;
        if ($z0) {
            ClassWriter $r4 = ((MethodWriter) this).f9987b;
            $r4.getValue();
            return m28474a(256, $r1, true, true);
        }
        boolean $z02 = get(str);
        if ($z02) {
            ClassWriter $r42 = ((MethodWriter) this).f9987b;
            $r42.getValue();
        } else {
            ClassWriter $r43 = ((MethodWriter) this).f9987b;
            $r43.getValue();
            $s0 = 100;
        }
        return m28474a((int) $s0, $r1, false, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000f */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m28444b(android.os.Bundle r9, android.os.Bundle r10) {
        /*
            r8 = this;
            if (r10 != 0) goto L3
            return
        L3:
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r1 = r0.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            boolean r2 = r9.containsKey(r4)
            if (r2 != 0) goto Lb
            com.google.android.gms.measurement.internal.ClassWriter r6 = r8.f9987b
            com.google.android.gms.measurement.internal.ByteVector r7 = r6.m28427b()
            java.lang.Object r3 = r10.get(r4)
            r7.m28468a(r9, r4, r3)
            goto Lb
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ByteVector.m28444b(android.os.Bundle, android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m28443b(InterfaceC3824i1 interfaceC3824i1, Bundle bundle) {
        try {
            interfaceC3824i1.mo29532l(bundle);
        } catch (RemoteException $r3) {
            ClassWriter $r4 = ((MethodWriter) this).f9987b;
            Item $r5 = $r4.get();
            C4312o3 $r6 = $r5.clear();
            $r6.m28013b("Error returning bundle value to wrapper", $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m28442b(InterfaceC3824i1 interfaceC3824i1, String str) {
        Bundle $r3 = new Bundle();
        $r3.putString("r", str);
        try {
            interfaceC3824i1.mo29532l($r3);
        } catch (RemoteException $r4) {
            ClassWriter $r5 = ((MethodWriter) this).f9987b;
            Item $r6 = $r5.get();
            C4312o3 $r7 = $r6.clear();
            $r7.m28013b("Error returning string value to wrapper", $r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m28441b(InterfaceC3824i1 interfaceC3824i1, boolean z) {
        Bundle $r2 = new Bundle();
        $r2.putBoolean("r", z);
        try {
            interfaceC3824i1.mo29532l($r2);
        } catch (RemoteException $r3) {
            ClassWriter $r4 = ((MethodWriter) this).f9987b;
            Item $r5 = $r4.get();
            C4312o3 $r6 = $r5.clear();
            $r6.m28013b("Error returning boolean value to wrapper", $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    final boolean m28438b(String str, String str2) {
        if (str2 == null) {
            ClassWriter $r3 = ((MethodWriter) this).f9987b;
            Item $r4 = $r3.get();
            C4312o3 $r5 = $r4.m28414g();
            $r5.m28013b("Name is required and can't be null. Type", str);
            return false;
        }
        int $i0 = str2.length();
        if ($i0 == 0) {
            ClassWriter $r32 = ((MethodWriter) this).f9987b;
            Item $r42 = $r32.get();
            C4312o3 $r52 = $r42.m28414g();
            $r52.m28013b("Name is required and can't be empty. Type", str);
            return false;
        }
        int $i1 = str2.codePointAt(0);
        boolean $z0 = Character.isLetter($i1);
        if (!$z0) {
            ClassWriter $r33 = ((MethodWriter) this).f9987b;
            Item $r43 = $r33.get();
            C4312o3 $r53 = $r43.m28414g();
            $r53.m28012c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int $i02 = str2.length();
        int $i12 = Character.charCount($i1);
        while ($i12 < $i02) {
            int $i2 = str2.codePointAt($i12);
            if ($i2 != 95) {
                boolean $z02 = Character.isLetterOrDigit($i2);
                if (!$z02) {
                    ClassWriter $r34 = ((MethodWriter) this).f9987b;
                    Item $r44 = $r34.get();
                    C4312o3 $r54 = $r44.m28414g();
                    $r54.m28012c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            $i12 += Character.charCount($i2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final boolean m28437c(String str) {
        putShort();
        ClassWriter $r2 = ((MethodWriter) this).f9987b;
        Context $r3 = $r2.getContext();
        C2955b $r4 = C2956c.m31548a($r3);
        int $i0 = $r4.m31555a(str);
        if ($i0 == 0) {
            return true;
        }
        ClassWriter $r22 = ((MethodWriter) this).f9987b;
        Item $r5 = $r22.get();
        C4312o3 $r6 = $r5.save();
        $r6.m28013b("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.Label
    protected final boolean copy() {
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    final int m28436f(String str) {
        boolean $z0 = m28438b("event param", str);
        if ($z0) {
            boolean $z02 = m28449a("event param", (String[]) null, (String[]) null, str);
            if ($z02) {
                ClassWriter $r2 = ((MethodWriter) this).f9987b;
                $r2.getValue();
                boolean $z03 = m28459a("event param", 40, str);
                return !$z03 ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final boolean get(Object obj) {
        boolean $z0 = obj instanceof Parcelable[];
        if ($z0) {
            return true;
        }
        boolean $z02 = obj instanceof ArrayList;
        if ($z02) {
            return true;
        }
        boolean $z03 = obj instanceof Bundle;
        return $z03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final int getSize(String str) {
        boolean $z0 = m28457a("user property", str);
        if ($z0) {
            String[] $r2 = C4164b6.f10034a;
            boolean $z02 = m28449a("user property", $r2, (String[]) null, str);
            if ($z02) {
                ClassWriter $r3 = ((MethodWriter) this).f9987b;
                $r3.getValue();
                boolean $z03 = m28459a("user property", 24, str);
                return !$z03 ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getValue(String $r1, int i, boolean z) {
        if ($r1 == null) {
            return null;
        }
        int $i1 = $r1.length();
        if ($r1.codePointCount(0, $i1) > i) {
            if (z) {
                int $i0 = $r1.offsetByCodePoints(0, i);
                return String.valueOf($r1.substring(0, $i0)).concat("...");
            }
            return null;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final byte[] marshall(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel $r2 = Parcel.obtain();
        try {
            parcelable.writeToParcel($r2, 0);
            byte[] $r3 = $r2.marshall();
            return $r3;
        } finally {
            $r2.recycle();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long next() {
        long $l0;
        long $l02;
        long $l03 = this.f9944c.get();
        if ($l03 != 0) {
            AtomicLong $r1 = this.f9944c;
            synchronized ($r1) {
                AtomicLong $r6 = this.f9944c;
                $r6.compareAndSet(-1L, 1L);
                AtomicLong $r62 = this.f9944c;
                $l0 = $r62.getAndIncrement();
            }
            return $l0;
        }
        AtomicLong $r12 = this.f9944c;
        synchronized ($r12) {
            long $l04 = System.nanoTime();
            ClassWriter $r3 = ((MethodWriter) this).f9987b;
            InterfaceC2967e $r4 = $r3.mo28412c();
            long $l2 = $r4.currentTimeMillis();
            Random $r2 = new Random($l04 ^ $l2);
            long $l05 = $r2.nextLong();
            int $i3 = this.f9943b + 1;
            this.f9943b = $i3;
            long $l22 = $i3;
            $l02 = $l05 + $l22;
        }
        return $l02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final void put(Bundle bundle, int i, String str, String str2, Object obj) {
        boolean $z0 = add(bundle, i);
        if ($z0) {
            ClassWriter $r5 = ((MethodWriter) this).f9987b;
            $r5.getValue();
            String $r3 = getValue(str, 40, true);
            bundle.putString("_ev", $r3);
            if (obj != null) {
                List.m31820a(bundle);
                boolean $z02 = obj instanceof String;
                if (!$z02) {
                    boolean $z03 = obj instanceof CharSequence;
                    if (!$z03) {
                        return;
                    }
                }
                String $r32 = obj.toString();
                int $i0 = $r32.length();
                long $l1 = $i0;
                bundle.putLong("_el", $l1);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final boolean put(String str, String str2, int i, Object obj) {
        if (obj == null) {
            return true;
        }
        boolean $z0 = obj instanceof Long;
        if ($z0) {
            return true;
        }
        boolean $z02 = obj instanceof Float;
        if ($z02) {
            return true;
        }
        boolean $z03 = obj instanceof Integer;
        if ($z03) {
            return true;
        }
        boolean $z04 = obj instanceof Byte;
        if ($z04) {
            return true;
        }
        boolean $z05 = obj instanceof Short;
        if ($z05) {
            return true;
        }
        boolean $z06 = obj instanceof Boolean;
        if ($z06) {
            return true;
        }
        boolean $z07 = obj instanceof Double;
        if ($z07) {
            return true;
        }
        boolean $z08 = obj instanceof String;
        if (!$z08) {
            boolean $z09 = obj instanceof Character;
            if (!$z09) {
                boolean $z010 = obj instanceof CharSequence;
                if (!$z010) {
                    return false;
                }
            }
        }
        String $r4 = obj.toString();
        int $i1 = $r4.length();
        if ($r4.codePointCount(0, $i1) > i) {
            ClassWriter $r5 = ((MethodWriter) this).f9987b;
            Item $r6 = $r5.get();
            C4312o3 $r7 = $r6.getValue();
            int $i0 = $r4.length();
            Integer $r8 = Integer.valueOf($i0);
            $r7.m28011d("Value is too long; discarded. Value kind, name, value length", str, str2, $r8);
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final int read(String str, Object obj) {
        boolean $z0;
        boolean $z02 = "_ldl".equals(str);
        if ($z02) {
            int $i0 = read(str);
            $z0 = put("user property referrer", str, $i0, obj);
        } else {
            int $i02 = read(str);
            $z0 = put("user property", str, $i02, obj);
        }
        return $z0 ? 0 : 7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final SecureRandom resizeInstructions() {
        putShort();
        SecureRandom $r1 = this.length;
        if ($r1 == null) {
            SecureRandom $r12 = new SecureRandom();
            this.length = $r12;
        }
        SecureRandom $r13 = this.length;
        return $r13;
    }
}
