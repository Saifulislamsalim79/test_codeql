package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C1103h0;
import p201g.p202a.C7452a;
import p201g.p202a.C7454c;
import p201g.p202a.C7455d;
import p201g.p202a.C7456e;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p228e.C7603a;
/* compiled from: AppCompatDrawableManager.java */
/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes2.dex */
public final class C1111i {

    /* renamed from: b */
    private static final PorterDuff.Mode f3369b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C1111i f3370c;

    /* renamed from: a */
    private C1103h0 f3371a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager.java */
    /* renamed from: androidx.appcompat.widget.i$a */
    /* loaded from: classes2.dex */
    public class C1112a implements C1103h0.InterfaceC1109f {

        /* renamed from: a */
        private final int[] f3372a = {C7456e.abc_textfield_search_default_mtrl_alpha, C7456e.abc_textfield_default_mtrl_alpha, C7456e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f3373b = {C7456e.abc_ic_commit_search_api_mtrl_alpha, C7456e.abc_seekbar_tick_mark_material, C7456e.abc_ic_menu_share_mtrl_alpha, C7456e.abc_ic_menu_copy_mtrl_am_alpha, C7456e.abc_ic_menu_cut_mtrl_alpha, C7456e.abc_ic_menu_selectall_mtrl_alpha, C7456e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f3374c = {C7456e.abc_textfield_activated_mtrl_alpha, C7456e.abc_textfield_search_activated_mtrl_alpha, C7456e.abc_cab_background_top_mtrl_alpha, C7456e.abc_text_cursor_material, C7456e.abc_text_select_handle_left_mtrl, C7456e.abc_text_select_handle_middle_mtrl, C7456e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        private final int[] f3375d = {C7456e.abc_popup_background_mtrl_mult, C7456e.abc_cab_background_internal_bg, C7456e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f3376e = {C7456e.abc_tab_indicator_material, C7456e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f3377f = {C7456e.abc_btn_check_material, C7456e.abc_btn_radio_material, C7456e.abc_btn_check_material_anim, C7456e.abc_btn_radio_material_anim};

        C1112a() {
        }

        /* renamed from: f */
        private boolean m37121f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m37120g(Context context) {
            return m37119h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m37119h(Context context, int i) {
            int m37064c = C1126m0.m37064c(context, C7452a.colorControlHighlight);
            return new ColorStateList(new int[][]{C1126m0.f3435b, C1126m0.f3437d, C1126m0.f3436c, C1126m0.f3439f}, new int[]{C1126m0.m37065b(context, C7452a.colorButtonNormal), C7603a.m18069e(m37064c, i), C7603a.m18069e(m37064c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m37118i(Context context) {
            return m37119h(context, C1126m0.m37064c(context, C7452a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m37117j(Context context) {
            return m37119h(context, C1126m0.m37064c(context, C7452a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m37116k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList m37062e = C1126m0.m37062e(context, C7452a.colorSwitchThumbNormal);
            if (m37062e != null && m37062e.isStateful()) {
                iArr[0] = C1126m0.f3435b;
                iArr2[0] = m37062e.getColorForState(iArr[0], 0);
                iArr[1] = C1126m0.f3438e;
                iArr2[1] = C1126m0.m37064c(context, C7452a.colorControlActivated);
                iArr[2] = C1126m0.f3439f;
                iArr2[2] = m37062e.getDefaultColor();
            } else {
                iArr[0] = C1126m0.f3435b;
                iArr2[0] = C1126m0.m37065b(context, C7452a.colorSwitchThumbNormal);
                iArr[1] = C1126m0.f3438e;
                iArr2[1] = C1126m0.m37064c(context, C7452a.colorControlActivated);
                iArr[2] = C1126m0.f3439f;
                iArr2[2] = C1126m0.m37064c(context, C7452a.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m37115l(C1103h0 c1103h0, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable m37154j = c1103h0.m37154j(context, C7456e.abc_star_black_48dp);
            Drawable m37154j2 = c1103h0.m37154j(context, C7456e.abc_star_half_black_48dp);
            if ((m37154j instanceof BitmapDrawable) && m37154j.getIntrinsicWidth() == dimensionPixelSize && m37154j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m37154j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m37154j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m37154j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m37154j2 instanceof BitmapDrawable) && m37154j2.getIntrinsicWidth() == dimensionPixelSize && m37154j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m37154j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m37154j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m37154j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m37114m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C1068a0.m37285a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1111i.f3369b;
            }
            drawable.setColorFilter(C1111i.m37131e(i, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1109f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo37126a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C1111i.m37135a()
                int[] r1 = r6.f3372a
                boolean r1 = r6.m37121f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p201g.p202a.C7452a.colorControlNormal
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f3374c
                boolean r1 = r6.m37121f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p201g.p202a.C7452a.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.f3375d
                boolean r1 = r6.m37121f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p201g.p202a.C7456e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p201g.p202a.C7456e.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.C1068a0.m37285a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.C1126m0.m37064c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C1111i.m37131e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1111i.C1112a.mo37126a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1109f
        /* renamed from: b */
        public PorterDuff.Mode mo37125b(int i) {
            if (i == C7456e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1109f
        /* renamed from: c */
        public Drawable mo37124c(C1103h0 c1103h0, Context context, int i) {
            if (i == C7456e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{c1103h0.m37154j(context, C7456e.abc_cab_background_internal_bg), c1103h0.m37154j(context, C7456e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == C7456e.abc_ratingbar_material) {
                return m37115l(c1103h0, context, C7455d.abc_star_big);
            }
            if (i == C7456e.abc_ratingbar_indicator_material) {
                return m37115l(c1103h0, context, C7455d.abc_star_medium);
            }
            if (i == C7456e.abc_ratingbar_small_material) {
                return m37115l(c1103h0, context, C7455d.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1109f
        /* renamed from: d */
        public ColorStateList mo37123d(Context context, int i) {
            if (i == C7456e.abc_edit_text_material) {
                return C7462a.m18691c(context, C7454c.abc_tint_edittext);
            }
            if (i == C7456e.abc_switch_track_mtrl_alpha) {
                return C7462a.m18691c(context, C7454c.abc_tint_switch_track);
            }
            if (i == C7456e.abc_switch_thumb_material) {
                return m37116k(context);
            }
            if (i == C7456e.abc_btn_default_mtrl_shape) {
                return m37117j(context);
            }
            if (i == C7456e.abc_btn_borderless_material) {
                return m37120g(context);
            }
            if (i == C7456e.abc_btn_colored_material) {
                return m37118i(context);
            }
            if (i != C7456e.abc_spinner_mtrl_am_alpha && i != C7456e.abc_spinner_textfield_background_material) {
                if (m37121f(this.f3373b, i)) {
                    return C1126m0.m37062e(context, C7452a.colorControlNormal);
                }
                if (m37121f(this.f3376e, i)) {
                    return C7462a.m18691c(context, C7454c.abc_tint_default);
                }
                if (m37121f(this.f3377f, i)) {
                    return C7462a.m18691c(context, C7454c.abc_tint_btn_checkable);
                }
                if (i == C7456e.abc_seekbar_thumb_material) {
                    return C7462a.m18691c(context, C7454c.abc_tint_seek_thumb);
                }
                return null;
            }
            return C7462a.m18691c(context, C7454c.abc_tint_spinner);
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1109f
        /* renamed from: e */
        public boolean mo37122e(Context context, int i, Drawable drawable) {
            if (i == C7456e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m37114m(layerDrawable.findDrawableByLayerId(16908288), C1126m0.m37064c(context, C7452a.colorControlNormal), C1111i.f3369b);
                m37114m(layerDrawable.findDrawableByLayerId(16908303), C1126m0.m37064c(context, C7452a.colorControlNormal), C1111i.f3369b);
                m37114m(layerDrawable.findDrawableByLayerId(16908301), C1126m0.m37064c(context, C7452a.colorControlActivated), C1111i.f3369b);
                return true;
            } else if (i == C7456e.abc_ratingbar_material || i == C7456e.abc_ratingbar_indicator_material || i == C7456e.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m37114m(layerDrawable2.findDrawableByLayerId(16908288), C1126m0.m37065b(context, C7452a.colorControlNormal), C1111i.f3369b);
                m37114m(layerDrawable2.findDrawableByLayerId(16908303), C1126m0.m37064c(context, C7452a.colorControlActivated), C1111i.f3369b);
                m37114m(layerDrawable2.findDrawableByLayerId(16908301), C1126m0.m37064c(context, C7452a.colorControlActivated), C1111i.f3369b);
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C1111i m37134b() {
        C1111i c1111i;
        synchronized (C1111i.class) {
            if (f3370c == null) {
                m37128h();
            }
            c1111i = f3370c;
        }
        return c1111i;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m37131e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m37152l;
        synchronized (C1111i.class) {
            m37152l = C1103h0.m37152l(i, mode);
        }
        return m37152l;
    }

    /* renamed from: h */
    public static synchronized void m37128h() {
        synchronized (C1111i.class) {
            if (f3370c == null) {
                C1111i c1111i = new C1111i();
                f3370c = c1111i;
                c1111i.f3371a = C1103h0.m37156h();
                f3370c.f3371a.m37143u(new C1112a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m37127i(Drawable drawable, C1132p0 c1132p0, int[] iArr) {
        C1103h0.m37141w(drawable, c1132p0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m37133c(Context context, int i) {
        return this.f3371a.m37154j(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m37132d(Context context, int i, boolean z) {
        return this.f3371a.m37153k(context, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m37130f(Context context, int i) {
        return this.f3371a.m37151m(context, i);
    }

    /* renamed from: g */
    public synchronized void m37129g(Context context) {
        this.f3371a.m37145s(context);
    }
}
