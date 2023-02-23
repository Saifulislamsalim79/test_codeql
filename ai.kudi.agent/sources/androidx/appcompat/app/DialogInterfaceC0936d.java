package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p201g.p202a.C7452a;
/* compiled from: AlertDialog.java */
/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes2.dex */
public class DialogInterfaceC0936d extends DialogC0964i implements DialogInterface {

    /* renamed from: c */
    final AlertController f2558c;

    /* compiled from: AlertDialog.java */
    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes2.dex */
    public static class C0937a {

        /* renamed from: P */
        private final AlertController.C0917f f2559P;
        private final int mTheme;

        public C0937a(Context context) {
            this(context, DialogInterfaceC0936d.m37784c(context, 0));
        }

        public DialogInterfaceC0936d create() {
            DialogInterfaceC0936d dialogInterfaceC0936d = new DialogInterfaceC0936d(this.f2559P.f2497a, this.mTheme);
            this.f2559P.m37807a(dialogInterfaceC0936d.f2558c);
            dialogInterfaceC0936d.setCancelable(this.f2559P.f2514r);
            if (this.f2559P.f2514r) {
                dialogInterfaceC0936d.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0936d.setOnCancelListener(this.f2559P.f2515s);
            dialogInterfaceC0936d.setOnDismissListener(this.f2559P.f2516t);
            DialogInterface.OnKeyListener onKeyListener = this.f2559P.f2517u;
            if (onKeyListener != null) {
                dialogInterfaceC0936d.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0936d;
        }

        public Context getContext() {
            return this.f2559P.f2497a;
        }

        public C0937a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2519w = listAdapter;
            c0917f.f2520x = onClickListener;
            return this;
        }

        public C0937a setCancelable(boolean z) {
            this.f2559P.f2514r = z;
            return this;
        }

        public C0937a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2490K = cursor;
            c0917f.f2491L = str;
            c0917f.f2520x = onClickListener;
            return this;
        }

        public C0937a setCustomTitle(View view) {
            this.f2559P.f2503g = view;
            return this;
        }

        public C0937a setIcon(int i) {
            this.f2559P.f2499c = i;
            return this;
        }

        public C0937a setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.f2559P.f2497a.getTheme().resolveAttribute(i, typedValue, true);
            this.f2559P.f2499c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public C0937a setInverseBackgroundForced(boolean z) {
            this.f2559P.f2493N = z;
            return this;
        }

        public C0937a setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2518v = c0917f.f2497a.getResources().getTextArray(i);
            this.f2559P.f2520x = onClickListener;
            return this;
        }

        public C0937a setMessage(int i) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2504h = c0917f.f2497a.getText(i);
            return this;
        }

        public C0937a setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2518v = c0917f.f2497a.getResources().getTextArray(i);
            AlertController.C0917f c0917f2 = this.f2559P;
            c0917f2.f2489J = onMultiChoiceClickListener;
            c0917f2.f2485F = zArr;
            c0917f2.f2486G = true;
            return this;
        }

        public C0937a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2508l = c0917f.f2497a.getText(i);
            this.f2559P.f2510n = onClickListener;
            return this;
        }

        public C0937a setNegativeButtonIcon(Drawable drawable) {
            this.f2559P.f2509m = drawable;
            return this;
        }

        public C0937a setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2511o = c0917f.f2497a.getText(i);
            this.f2559P.f2513q = onClickListener;
            return this;
        }

        public C0937a setNeutralButtonIcon(Drawable drawable) {
            this.f2559P.f2512p = drawable;
            return this;
        }

        public C0937a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f2559P.f2515s = onCancelListener;
            return this;
        }

        public C0937a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f2559P.f2516t = onDismissListener;
            return this;
        }

        public C0937a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f2559P.f2494O = onItemSelectedListener;
            return this;
        }

        public C0937a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f2559P.f2517u = onKeyListener;
            return this;
        }

        public C0937a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2505i = c0917f.f2497a.getText(i);
            this.f2559P.f2507k = onClickListener;
            return this;
        }

        public C0937a setPositiveButtonIcon(Drawable drawable) {
            this.f2559P.f2506j = drawable;
            return this;
        }

        public C0937a setRecycleOnMeasureEnabled(boolean z) {
            this.f2559P.f2496Q = z;
            return this;
        }

        public C0937a setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2518v = c0917f.f2497a.getResources().getTextArray(i);
            AlertController.C0917f c0917f2 = this.f2559P;
            c0917f2.f2520x = onClickListener;
            c0917f2.f2488I = i2;
            c0917f2.f2487H = true;
            return this;
        }

        public C0937a setTitle(int i) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2502f = c0917f.f2497a.getText(i);
            return this;
        }

        public C0937a setView(int i) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2522z = null;
            c0917f.f2521y = i;
            c0917f.f2484E = false;
            return this;
        }

        public DialogInterfaceC0936d show() {
            DialogInterfaceC0936d create = create();
            create.show();
            return create;
        }

        public C0937a(Context context, int i) {
            this.f2559P = new AlertController.C0917f(new ContextThemeWrapper(context, DialogInterfaceC0936d.m37784c(context, i)));
            this.mTheme = i;
        }

        public C0937a setIcon(Drawable drawable) {
            this.f2559P.f2500d = drawable;
            return this;
        }

        public C0937a setMessage(CharSequence charSequence) {
            this.f2559P.f2504h = charSequence;
            return this;
        }

        public C0937a setTitle(CharSequence charSequence) {
            this.f2559P.f2502f = charSequence;
            return this;
        }

        public C0937a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2518v = charSequenceArr;
            c0917f.f2520x = onClickListener;
            return this;
        }

        public C0937a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2508l = charSequence;
            c0917f.f2510n = onClickListener;
            return this;
        }

        public C0937a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2511o = charSequence;
            c0917f.f2513q = onClickListener;
            return this;
        }

        public C0937a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2505i = charSequence;
            c0917f.f2507k = onClickListener;
            return this;
        }

        public C0937a setView(View view) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2522z = view;
            c0917f.f2521y = 0;
            c0917f.f2484E = false;
            return this;
        }

        public C0937a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2518v = charSequenceArr;
            c0917f.f2489J = onMultiChoiceClickListener;
            c0917f.f2485F = zArr;
            c0917f.f2486G = true;
            return this;
        }

        public C0937a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2490K = cursor;
            c0917f.f2520x = onClickListener;
            c0917f.f2488I = i;
            c0917f.f2491L = str;
            c0917f.f2487H = true;
            return this;
        }

        @Deprecated
        public C0937a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2522z = view;
            c0917f.f2521y = 0;
            c0917f.f2484E = true;
            c0917f.f2480A = i;
            c0917f.f2481B = i2;
            c0917f.f2482C = i3;
            c0917f.f2483D = i4;
            return this;
        }

        public C0937a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2490K = cursor;
            c0917f.f2489J = onMultiChoiceClickListener;
            c0917f.f2492M = str;
            c0917f.f2491L = str2;
            c0917f.f2486G = true;
            return this;
        }

        public C0937a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2518v = charSequenceArr;
            c0917f.f2520x = onClickListener;
            c0917f.f2488I = i;
            c0917f.f2487H = true;
            return this;
        }

        public C0937a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0917f c0917f = this.f2559P;
            c0917f.f2519w = listAdapter;
            c0917f.f2520x = onClickListener;
            c0917f.f2488I = i;
            c0917f.f2487H = true;
            return this;
        }
    }

    protected DialogInterfaceC0936d(Context context, int i) {
        super(context, m37784c(context, i));
        this.f2558c = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: c */
    static int m37784c(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7452a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public Button m37786a(int i) {
        return this.f2558c.m37832c(i);
    }

    /* renamed from: b */
    public ListView m37785b() {
        return this.f2558c.m37830e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0964i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2558c.m37829f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2558c.m37827h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2558c.m37826i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0964i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2558c.m37817r(charSequence);
    }
}
