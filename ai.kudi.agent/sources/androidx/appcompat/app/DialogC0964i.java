package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p201g.p202a.C7452a;
import p201g.p202a.p209o.AbstractC7485b;
import p201g.p227h.p238l.C7695f;
/* compiled from: AppCompatDialog.java */
/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes2.dex */
public class DialogC0964i extends Dialog implements f {
    private g mDelegate;
    private final C7695f.a mKeyDispatcher;

    /* compiled from: AppCompatDialog.java */
    /* renamed from: androidx.appcompat.app.i$a */
    /* loaded from: classes2.dex */
    class C0965a implements C7695f.a {
        C0965a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return DialogC0964i.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public DialogC0964i(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C7452a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C7695f.m17798e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().i(i);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.h(this, this);
        }
        return this.mDelegate;
    }

    public AbstractC0925a getSupportActionBar() {
        return getDelegate().n();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().o();
        super.onCreate(bundle);
        getDelegate().r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().x();
    }

    public void onSupportActionModeFinished(AbstractC7485b abstractC7485b) {
    }

    public void onSupportActionModeStarted(AbstractC7485b abstractC7485b) {
    }

    public AbstractC7485b onWindowStartingSupportActionMode(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        getDelegate().C(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().H(charSequence);
    }

    boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().A(i);
    }

    public DialogC0964i(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C0965a();
        g delegate = getDelegate();
        delegate.G(getThemeResId(context, i));
        delegate.r((Bundle) null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().D(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().E(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().H(getContext().getString(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogC0964i(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new C0965a();
    }
}
