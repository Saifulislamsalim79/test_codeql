package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class Item extends Label {

    /* renamed from: a */
    private final C4312o3 f9976a;

    /* renamed from: b */
    private final C4312o3 f9977b;

    /* renamed from: c */
    private char f9978c;

    /* renamed from: g */
    private final C4312o3 f9979g;

    /* renamed from: h */
    private final C4312o3 f9980h;

    /* renamed from: i */
    private final C4312o3 f9981i;

    /* renamed from: id */
    private long f9982id;

    /* renamed from: j */
    private final C4312o3 f9983j;
    private final C4312o3 jid;
    private final C4312o3 text;

    /* renamed from: x */
    private final C4312o3 f9984x;

    /* renamed from: y */
    private String f9985y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Item(ClassWriter classWriter) {
        super(classWriter);
        this.f9978c = (char) 0;
        this.f9982id = -1L;
        C4312o3 $r2 = new C4312o3(this, 6, false, false);
        this.f9977b = $r2;
        C4312o3 $r22 = new C4312o3(this, 6, true, false);
        this.f9979g = $r22;
        C4312o3 $r23 = new C4312o3(this, 6, false, true);
        this.f9981i = $r23;
        C4312o3 $r24 = new C4312o3(this, 5, false, false);
        this.f9983j = $r24;
        C4312o3 $r25 = new C4312o3(this, 5, true, false);
        this.jid = $r25;
        C4312o3 $r26 = new C4312o3(this, 5, false, true);
        this.text = $r26;
        C4312o3 $r27 = new C4312o3(this, 4, false, false);
        this.f9984x = $r27;
        C4312o3 $r28 = new C4312o3(this, 3, false, false);
        this.f9976a = $r28;
        C4312o3 $r29 = new C4312o3(this, 2, false, false);
        this.f9980h = $r29;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    static String m28417a(boolean z, String $r0, Object obj, Object obj2, Object obj3) {
        String $r4 = "";
        if ($r0 == null) {
            $r0 = "";
        }
        String $r5 = format(z, obj);
        String $r6 = format(z, obj2);
        String $r7 = format(z, obj3);
        StringBuilder $r8 = new StringBuilder();
        boolean $z0 = TextUtils.isEmpty($r0);
        if (!$z0) {
            $r8.append($r0);
            $r4 = ": ";
        }
        boolean $z02 = TextUtils.isEmpty($r5);
        String $r02 = ", ";
        if (!$z02) {
            $r8.append($r4);
            $r8.append($r5);
            $r4 = ", ";
        }
        boolean $z03 = TextUtils.isEmpty($r6);
        if ($z03) {
            $r02 = $r4;
        } else {
            $r8.append($r4);
            $r8.append($r6);
        }
        boolean $z04 = TextUtils.isEmpty($r7);
        if (!$z04) {
            $r8.append($r02);
            $r8.append($r7);
        }
        return $r8.toString();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static String format(boolean $z0, Object $r0) {
        String $r1;
        String $r12;
        String $r4;
        if ($r0 == null) {
            return "";
        }
        boolean $z1 = $r0 instanceof Integer;
        if ($z1) {
            Integer $r2 = (Integer) $r0;
            int $i0 = $r2.intValue();
            long $l1 = $i0;
            $r0 = Long.valueOf($l1);
        }
        boolean $z12 = $r0 instanceof Long;
        int $i02 = 0;
        if ($z12) {
            if (!$z0) {
                String $r13 = $r0.toString();
                return $r13;
            }
            Long $r3 = (Long) $r0;
            long $l12 = $r3.longValue();
            if (Math.abs($l12) < 100) {
                String $r14 = $r0.toString();
                return $r14;
            }
            char $c3 = $r0.toString().charAt(0);
            String $r15 = $c3 == '-' ? "-" : "";
            long $l13 = $r3.longValue();
            String $r42 = String.valueOf(Math.abs($l13));
            int $i03 = $r42.length();
            double $d0 = $i03 - 1;
            long $l14 = Math.round(Math.pow(10.0d, $d0));
            int $i04 = $r42.length();
            double $d02 = $i04;
            long $l4 = Math.round(Math.pow(10.0d, $d02) - 1.0d);
            int $i05 = $r15.length();
            int $i5 = $r15.length();
            StringBuilder $r5 = new StringBuilder($i05 + 43 + $i5);
            $r5.append($r15);
            $r5.append($l14);
            $r5.append("...");
            $r5.append($r15);
            $r5.append($l4);
            String $r16 = $r5.toString();
            return $r16;
        }
        boolean $z13 = $r0 instanceof Boolean;
        if ($z13) {
            String $r17 = $r0.toString();
            return $r17;
        }
        boolean $z14 = $r0 instanceof Throwable;
        if (!$z14) {
            boolean $z15 = $r0 instanceof C4324p3;
            if ($z15) {
                C4324p3 $r10 = (C4324p3) $r0;
                $r1 = $r10.f10574a;
                return $r1;
            } else if ($z0) {
                return "-";
            } else {
                String $r18 = $r0.toString();
                return $r18;
            }
        }
        Throwable $r6 = (Throwable) $r0;
        if ($z0) {
            Class $r7 = $r6.getClass();
            $r12 = $r7.getName();
        } else {
            $r12 = $r6.toString();
        }
        StringBuilder $r52 = new StringBuilder($r12);
        String $r19 = b5.class.getCanonicalName();
        String $r110 = get($r19);
        StackTraceElement[] $r8 = $r6.getStackTrace();
        int $i52 = $r8.length;
        while (true) {
            if ($i02 >= $i52) {
                break;
            }
            StackTraceElement $r9 = $r8[$i02];
            if (!$r9.isNativeMethod() && ($r4 = $r9.getClassName()) != null && get($r4).equals($r110)) {
                $r52.append(": ");
                $r52.append($r9);
                break;
            }
            $i02++;
        }
        String $r111 = $r52.toString();
        return $r111;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static String get(String str) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            return "";
        }
        int $i0 = str.lastIndexOf(46);
        if ($i0 == -1) {
            return str;
        }
        String $r0 = str.substring(0, $i0);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Object toString(String str) {
        if (str == null) {
            return null;
        }
        C4324p3 $r0 = new C4324p3(str);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m28419a(int $i0, boolean z, boolean z2, String $r1, Object obj, Object obj2, Object obj3) {
        if (!z) {
            String $r5 = set();
            boolean $z0 = Log.isLoggable($r5, $i0);
            if ($z0) {
                String $r52 = m28417a(false, $r1, obj, obj2, obj3);
                String $r6 = set();
                Log.println($i0, $r6, $r52);
            }
        }
        if (z2 || $i0 < 5) {
            return;
        }
        List.m31820a($r1);
        ClassWriter $r7 = ((MethodWriter) this).f9987b;
        C4429y4 $r8 = $r7.booleanValue();
        if ($r8 == null) {
            Log.println(6, set(), "Scheduler not set. Not logging error/warn");
            return;
        }
        Label r11 = (Label) $r8;
        boolean $z02 = r11.equals();
        if (!$z02) {
            Log.println(6, set(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if ($i0 >= 9) {
            $i0 = 8;
        }
        Runnable r10 = new RunnableC4300n3(this, $i0, $r1, obj, obj2, obj3);
        Runnable r12 = r10;
        $r8.m27810z(r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final C4312o3 m28416b() {
        C4312o3 r1 = this.f9977b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4312o3 clear() {
        C4312o3 r1 = this.f9983j;
        return r1;
    }

    @Override // com.google.android.gms.measurement.internal.Label
    protected final boolean copy() {
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: g */
    public final C4312o3 m28414g() {
        C4312o3 r1 = this.f9981i;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4312o3 getId() {
        C4312o3 r1 = this.f9979g;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4312o3 getJid() {
        C4312o3 r1 = this.jid;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4312o3 getTitle() {
        C4312o3 r1 = this.f9980h;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4312o3 getValue() {
        C4312o3 r1 = this.text;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: r */
    public final C4312o3 m28413r() {
        C4312o3 r1 = this.f9984x;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4312o3 save() {
        C4312o3 r1 = this.f9976a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final String set() {
        String $r1;
        synchronized (this) {
            String $r12 = this.f9985y;
            if ($r12 == null) {
                ClassWriter $r2 = ((MethodWriter) this).f9987b;
                String $r13 = $r2.m28423i();
                if ($r13 != null) {
                    ClassWriter $r22 = ((MethodWriter) this).f9987b;
                    String $r14 = $r22.m28423i();
                    this.f9985y = $r14;
                } else {
                    ClassWriter $r23 = ((MethodWriter) this).f9987b;
                    C4215g $r3 = $r23.getValue();
                    String $r15 = $r3.m28257e();
                    this.f9985y = $r15;
                }
            }
            String $r16 = this.f9985y;
            List.m31820a($r16);
            $r1 = this.f9985y;
        }
        return $r1;
    }
}
