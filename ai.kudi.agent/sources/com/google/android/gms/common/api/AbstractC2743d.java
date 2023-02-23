package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.C2730a.InterfaceC2734d;
import com.google.android.gms.common.api.internal.AbstractC2761d;
import com.google.android.gms.common.api.internal.AbstractC2796p;
import com.google.android.gms.common.api.internal.BinderC2816w0;
import com.google.android.gms.common.api.internal.C2754b;
import com.google.android.gms.common.api.internal.C2766f;
import com.google.android.gms.common.api.internal.C2772h;
import com.google.android.gms.common.api.internal.C2813v;
import com.google.android.gms.common.api.internal.InterfaceC2793o;
import com.google.android.gms.common.api.internal.ServiceConnectionC2782k;
import com.google.android.gms.common.api.internal.Type;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.List;
import com.google.android.gms.common.util.C2974l;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.Item;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.d */
/* loaded from: classes.dex */
public abstract class AbstractC2743d<O extends C2730a.InterfaceC2734d> {

    /* renamed from: a */
    private final Context f7709a;

    /* renamed from: b */
    private final InterfaceC2793o f7710b;

    /* renamed from: c */
    private final C2730a<O> f7711c;
    @NotOnlyInitialized

    /* renamed from: d */
    private final ExtensionData f7712d;

    /* renamed from: e */
    private final C2754b<O> f7713e;

    /* renamed from: i */
    private final O f7714i;

    /* renamed from: j */
    protected final C2766f f7715j;

    /* renamed from: k */
    private final Looper f7716k;

    /* renamed from: l */
    private final String f7717l;

    /* renamed from: m */
    private final int f7718m;

    public AbstractC2743d(Activity activity, C2730a c2730a, C2730a.InterfaceC2734d interfaceC2734d, c$a c_a) {
        this(activity, activity, c2730a, interfaceC2734d, c_a);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2743d(android.app.Activity r4, com.google.android.gms.common.api.C2730a r5, com.google.android.gms.common.api.C2730a.InterfaceC2734d r6, com.google.android.gms.common.api.internal.InterfaceC2793o r7) {
        /*
            r3 = this;
            com.google.android.gms.common.api.c$a$a r0 = new com.google.android.gms.common.api.c$a$a
            r0.<init>()
            r0.m32084c(r7)
            android.os.Looper r1 = r4.getMainLooper()
            r0.m32085b(r1)
            com.google.android.gms.common.api.c$a r2 = r0.m32086a()
            r3.<init>(r4, r5, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC2743d.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.o):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC2743d(Context context, Activity activity, C2730a c2730a, C2730a.InterfaceC2734d interfaceC2734d, c$a c_a) {
        List.toArray(context, "Null context is not permitted.");
        List.toArray(c2730a, "Api must not be null.");
        List.toArray(c_a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context $r10 = context.getApplicationContext();
        this.f7709a = $r10;
        boolean $z0 = C2974l.m31512k();
        String $r11 = null;
        if ($z0) {
            Class[] $r4 = new Class[0];
            try {
                Method $r13 = Context.class.getMethod("getAttributionTag", $r4);
                Object[] $r14 = new Object[0];
                Object $r15 = $r13.invoke(context, $r14);
                $r11 = (String) $r15;
            } catch (IllegalAccessException e) {
            } catch (NoSuchMethodException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
        this.f7717l = $r11;
        this.f7711c = c2730a;
        this.f7714i = interfaceC2734d;
        Looper $r16 = c_a.f7706b;
        this.f7716k = $r16;
        C2754b $r17 = C2754b.m32051a(c2730a, interfaceC2734d, $r11);
        this.f7713e = $r17;
        Type $r18 = new Type(this);
        this.f7712d = $r18;
        Context $r8 = this.f7709a;
        C2766f $r19 = C2766f.m32037a($r8);
        this.f7715j = $r19;
        int $i0 = $r19.next();
        this.f7718m = $i0;
        InterfaceC2793o $r20 = c_a.f7705a;
        this.f7710b = $r20;
        if (activity != null) {
            boolean $z02 = activity instanceof GoogleApiActivity;
            if (!$z02) {
                Looper $r162 = Looper.myLooper();
                Looper $r21 = Looper.getMainLooper();
                if ($r162 == $r21) {
                    C2766f $r192 = this.f7715j;
                    C2754b $r172 = this.f7713e;
                    C2813v.u(activity, $r192, $r172);
                }
            }
        }
        this.f7715j.clear(this);
    }

    public AbstractC2743d(Context context, C2730a c2730a, C2730a.InterfaceC2734d interfaceC2734d, c$a c_a) {
        this(context, null, c2730a, interfaceC2734d, c_a);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2743d(android.content.Context r3, com.google.android.gms.common.api.C2730a r4, com.google.android.gms.common.api.C2730a.InterfaceC2734d r5, com.google.android.gms.common.api.internal.InterfaceC2793o r6) {
        /*
            r2 = this;
            com.google.android.gms.common.api.c$a$a r0 = new com.google.android.gms.common.api.c$a$a
            r0.<init>()
            r0.m32084c(r6)
            com.google.android.gms.common.api.c$a r1 = r0.m32086a()
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC2743d.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.o):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final AbstractC2761d m32082a(int i, AbstractC2761d abstractC2761d) {
        abstractC2761d.m32061k();
        C2766f $r2 = this.f7715j;
        $r2.m32035a(this, i, abstractC2761d);
        return abstractC2761d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Item m32081a(int i, AbstractC2796p abstractC2796p) {
        C4465k $r4 = new C4465k();
        C2766f $r2 = this.f7715j;
        InterfaceC2793o $r3 = this.f7710b;
        $r2.m32034a(this, i, abstractC2796p, $r4, $r3);
        Item $r5 = $r4.m27777a();
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C2730a.InterfaceC2739f m32079a(Looper looper, C2772h c2772h) {
        C2867e.C2868a $r5 = m32083a();
        C2867e $r6 = $r5.m31754a();
        C2730a $r7 = this.f7711c;
        C2730a.AbstractC2731a $r8 = $r7.m32092a();
        List.m31820a($r8);
        Context $r1 = this.f7709a;
        C2730a.InterfaceC2734d $r2 = this.f7714i;
        C2730a.InterfaceC2739f $r9 = $r8.a($r1, looper, $r6, $r2, c2772h, c2772h);
        String $r10 = getId();
        if ($r10 != null) {
            boolean $z0 = $r9 instanceof AbstractC2854c;
            if ($z0) {
                ((AbstractC2854c) $r9).m31805O($r10);
            }
        }
        if ($r10 != null) {
            boolean $z02 = $r9 instanceof ServiceConnectionC2782k;
            if ($z02) {
                ((ServiceConnectionC2782k) $r9).m31958q($r10);
            }
        }
        return $r9;
    }

    /* renamed from: a */
    public AbstractC2761d m32078a(AbstractC2761d abstractC2761d) {
        m32082a(0, abstractC2761d);
        return abstractC2761d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final BinderC2816w0 m32080a(Context context, Handler handler) {
        C2867e.C2868a $r4 = m32083a();
        C2867e $r5 = $r4.m31754a();
        BinderC2816w0 $r3 = new BinderC2816w0(context, handler, $r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.google.android.gms.common.internal.C2867e.C2868a m32083a() {
        /*
            r14 = this;
            com.google.android.gms.common.internal.e$a r0 = new com.google.android.gms.common.internal.e$a
            r0.<init>()
            O extends com.google.android.gms.common.api.a$d r1 = r14.f7714i
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C2730a.InterfaceC2734d.InterfaceC2736b
            if (r2 == 0) goto L1a
            r4 = r1
            com.google.android.gms.common.api.a$d$b r4 = (com.google.android.gms.common.api.C2730a.InterfaceC2734d.InterfaceC2736b) r4
            r3 = r4
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = r3.m32088a()
            if (r5 == 0) goto L1a
            android.accounts.Account r6 = r5.m32159f()
            goto L2a
        L1a:
            O extends com.google.android.gms.common.api.a$d r1 = r14.f7714i
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C2730a.InterfaceC2734d.InterfaceC2735a
            if (r2 == 0) goto L29
            r8 = r1
            com.google.android.gms.common.api.a$d$a r8 = (com.google.android.gms.common.api.C2730a.InterfaceC2734d.InterfaceC2735a) r8
            r7 = r8
            android.accounts.Account r6 = r7.m32089b()
            goto L2a
        L29:
            r6 = 0
        L2a:
            r0.m31751d(r6)
            O extends com.google.android.gms.common.api.a$d r1 = r14.f7714i
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C2730a.InterfaceC2734d.InterfaceC2736b
            if (r2 == 0) goto L47
            r9 = r1
            com.google.android.gms.common.api.a$d$b r9 = (com.google.android.gms.common.api.C2730a.InterfaceC2734d.InterfaceC2736b) r9
            r3 = r9
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = r3.m32088a()
            if (r5 != 0) goto L42
            java.util.Set r10 = java.util.Collections.emptySet()
            goto L4b
        L42:
            java.util.Set r10 = r5.m32160e0()
            goto L4b
        L47:
            java.util.Set r10 = java.util.Collections.emptySet()
        L4b:
            r0.m31752c(r10)
            android.content.Context r11 = r14.f7709a
            java.lang.Class r12 = r11.getClass()
            java.lang.String r13 = r12.getName()
            r0.m31750e(r13)
            android.content.Context r11 = r14.f7709a
            java.lang.String r13 = r11.getPackageName()
            r0.m31753b(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC2743d.m32083a():com.google.android.gms.common.internal.e$a");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Item m32077a(AbstractC2796p abstractC2796p) {
        Item $r1 = m32081a(2, abstractC2796p);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public ExtensionData m32076b() {
        ExtensionData r1 = this.f7712d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public Item m32075b(AbstractC2796p abstractC2796p) {
        Item $r1 = m32081a(0, abstractC2796p);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Looper m32074c() {
        Looper r1 = this.f7716k;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public Item m32073c(AbstractC2796p abstractC2796p) {
        Item $r1 = m32081a(1, abstractC2796p);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected String getId() {
        String r1 = this.f7717l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C2754b getString() {
        C2754b r1 = this.f7713e;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: l */
    public final int m32072l() {
        int i0 = this.f7718m;
        return i0;
    }
}
