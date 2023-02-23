package p272h.p275b.p283c.p285b;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
/* compiled from: ViewQuery.java */
/* renamed from: h.b.c.b.a */
/* loaded from: classes2.dex */
public class C8234a {

    /* renamed from: a */
    private Activity f19799a;

    /* renamed from: b */
    private View f19800b;

    /* renamed from: c */
    private View f19801c;

    /* renamed from: d */
    private SparseArray<View> f19802d = new SparseArray<>();

    public C8234a(View view) {
        this.f19800b = view;
        this.f19801c = view;
        view.getContext();
    }

    /* renamed from: a */
    public C8234a m16457a(boolean z) {
        View view = this.f19801c;
        if (view != null && (view instanceof Checkable)) {
            ((Checkable) view).setChecked(z);
        }
        return this;
    }

    /* renamed from: b */
    public C8234a m16456b(View.OnClickListener onClickListener) {
        View view = this.f19801c;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        return this;
    }

    /* renamed from: c */
    public C8234a m16455c(boolean z) {
        View view = this.f19801c;
        if (view != null) {
            view.setEnabled(z);
        }
        return this;
    }

    /* renamed from: d */
    public C8234a m16454d() {
        View view = this.f19801c;
        if (view != null) {
            view.setVisibility(8);
        }
        return this;
    }

    /* renamed from: e */
    public C8234a m16453e(int i) {
        View view = this.f19802d.get(i);
        this.f19801c = view;
        if (view == null) {
            View view2 = this.f19800b;
            if (view2 != null) {
                this.f19801c = view2.findViewById(i);
            } else {
                this.f19801c = this.f19799a.findViewById(i);
            }
            this.f19802d.put(i, this.f19801c);
        }
        return this;
    }

    /* renamed from: f */
    public C8234a m16452f(int i) {
        View view = this.f19801c;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i);
        }
        return this;
    }

    /* renamed from: g */
    public ImageView m16451g() {
        return (ImageView) m16448j();
    }

    /* renamed from: h */
    public C8234a m16450h(int i) {
        View view = this.f19801c;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(i);
        }
        return this;
    }

    /* renamed from: i */
    public C8234a m16449i(CharSequence charSequence) {
        View view = this.f19801c;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(charSequence);
        }
        return this;
    }

    /* renamed from: j */
    public <T extends View> T m16448j() {
        return (T) this.f19801c;
    }

    /* renamed from: k */
    public C8234a m16447k(int i) {
        View view = this.f19801c;
        if (view != null) {
            view.setVisibility(i);
        }
        return this;
    }

    /* renamed from: l */
    public C8234a m16446l() {
        View view = this.f19801c;
        if (view != null) {
            view.setVisibility(0);
        }
        return this;
    }
}
