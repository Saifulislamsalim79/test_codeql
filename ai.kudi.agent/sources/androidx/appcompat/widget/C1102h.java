package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1392c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes2.dex */
public class C1102h {

    /* renamed from: a */
    private final CompoundButton f3353a;

    /* renamed from: b */
    private ColorStateList f3354b = null;

    /* renamed from: c */
    private PorterDuff.Mode f3355c = null;

    /* renamed from: d */
    private boolean f3356d = false;

    /* renamed from: e */
    private boolean f3357e = false;

    /* renamed from: f */
    private boolean f3358f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1102h(CompoundButton compoundButton) {
        this.f3353a = compoundButton;
    }

    /* renamed from: a */
    void m37171a() {
        Drawable m36122a = C1392c.m36122a(this.f3353a);
        if (m36122a != null) {
            if (this.f3356d || this.f3357e) {
                Drawable mutate = C1365a.m36184r(m36122a).mutate();
                if (this.f3356d) {
                    C1365a.m36187o(mutate, this.f3354b);
                }
                if (this.f3357e) {
                    C1365a.m36186p(mutate, this.f3355c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f3353a.getDrawableState());
                }
                this.f3353a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m37170b(int i) {
        Drawable m36122a;
        return (Build.VERSION.SDK_INT >= 17 || (m36122a = C1392c.m36122a(this.f3353a)) == null) ? i : i + m36122a.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m37169c() {
        return this.f3354b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m37168d() {
        return this.f3355c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0043, B:13:0x004b, B:15:0x0053, B:16:0x0062, B:18:0x006a, B:19:0x0075, B:21:0x007d), top: B:28:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0043, B:13:0x004b, B:15:0x0053, B:16:0x0062, B:18:0x006a, B:19:0x0075, B:21:0x007d), top: B:28:0x001f }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m37167e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f3353a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p201g.p202a.C7461j.CompoundButton
            r2 = 0
            androidx.appcompat.widget.r0 r0 = androidx.appcompat.widget.C1138r0.m37026v(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f3353a
            android.content.Context r4 = r3.getContext()
            int[] r5 = p201g.p202a.C7461j.CompoundButton
            android.content.res.TypedArray r7 = r0.m37030r()
            r9 = 0
            r6 = r11
            r8 = r12
            p201g.p227h.p238l.C7759x.m17502n0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = p201g.p202a.C7461j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.m37029s(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L40
            int r11 = p201g.p202a.C7461j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L92
            int r11 = r0.m37034n(r11, r2)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L40
            android.widget.CompoundButton r12 = r10.f3353a     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            android.widget.CompoundButton r1 = r10.f3353a     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            android.content.Context r1 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            android.graphics.drawable.Drawable r11 = p201g.p202a.p203k.p204a.C7462a.m18690d(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            r11 = 1
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 != 0) goto L62
            int r11 = p201g.p202a.C7461j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.m37029s(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L62
            int r11 = p201g.p202a.C7461j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L92
            int r11 = r0.m37034n(r11, r2)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L62
            android.widget.CompoundButton r12 = r10.f3353a     // Catch: java.lang.Throwable -> L92
            android.widget.CompoundButton r1 = r10.f3353a     // Catch: java.lang.Throwable -> L92
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L92
            android.graphics.drawable.Drawable r11 = p201g.p202a.p203k.p204a.C7462a.m18690d(r1, r11)     // Catch: java.lang.Throwable -> L92
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L92
        L62:
            int r11 = p201g.p202a.C7461j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.m37029s(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L75
            android.widget.CompoundButton r11 = r10.f3353a     // Catch: java.lang.Throwable -> L92
            int r12 = p201g.p202a.C7461j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L92
            android.content.res.ColorStateList r12 = r0.m37045c(r12)     // Catch: java.lang.Throwable -> L92
            androidx.core.widget.C1392c.m36120c(r11, r12)     // Catch: java.lang.Throwable -> L92
        L75:
            int r11 = p201g.p202a.C7461j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.m37029s(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L8e
            android.widget.CompoundButton r11 = r10.f3353a     // Catch: java.lang.Throwable -> L92
            int r12 = p201g.p202a.C7461j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L92
            r1 = -1
            int r12 = r0.m37037k(r12, r1)     // Catch: java.lang.Throwable -> L92
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.C1068a0.m37281e(r12, r1)     // Catch: java.lang.Throwable -> L92
            androidx.core.widget.C1392c.m36119d(r11, r12)     // Catch: java.lang.Throwable -> L92
        L8e:
            r0.m37025w()
            return
        L92:
            r11 = move-exception
            r0.m37025w()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1102h.m37167e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m37166f() {
        if (this.f3358f) {
            this.f3358f = false;
            return;
        }
        this.f3358f = true;
        m37171a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37165g(ColorStateList colorStateList) {
        this.f3354b = colorStateList;
        this.f3356d = true;
        m37171a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37164h(PorterDuff.Mode mode) {
        this.f3355c = mode;
        this.f3357e = true;
        m37171a();
    }
}
