package p272h.p368e.p369a.p371c;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p272h.p368e.p369a.AbstractC9419a;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p445b0.AbstractC11272a;
/* compiled from: TextViewTextObservable.java */
/* renamed from: h.e.a.c.b */
/* loaded from: classes2.dex */
final class C9422b extends AbstractC9419a<CharSequence> {

    /* renamed from: c */
    private final TextView f22056c;

    /* compiled from: TextViewTextObservable.java */
    /* renamed from: h.e.a.c.b$a */
    /* loaded from: classes2.dex */
    static final class C9423a extends AbstractC11272a implements TextWatcher {

        /* renamed from: d */
        private final TextView f22057d;

        /* renamed from: e */
        private final InterfaceC11695u<? super CharSequence> f22058e;

        C9423a(TextView textView, InterfaceC11695u<? super CharSequence> interfaceC11695u) {
            this.f22057d = textView;
            this.f22058e = interfaceC11695u;
        }

        @Override // p425j.p444e.p445b0.AbstractC11272a
        /* renamed from: a */
        protected void mo11230a() {
            this.f22057d.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (m11228j()) {
                return;
            }
            this.f22058e.mo331f(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9422b(TextView textView) {
        this.f22056c = textView;
    }

    @Override // p272h.p368e.p369a.AbstractC9419a
    /* renamed from: u0 */
    protected void mo14783u0(InterfaceC11695u<? super CharSequence> interfaceC11695u) {
        C9423a c9423a = new C9423a(this.f22056c, interfaceC11695u);
        interfaceC11695u.mo332d(c9423a);
        this.f22056c.addTextChangedListener(c9423a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p272h.p368e.p369a.AbstractC9419a
    /* renamed from: v0 */
    public CharSequence mo14784t0() {
        return this.f22056c.getText();
    }
}
