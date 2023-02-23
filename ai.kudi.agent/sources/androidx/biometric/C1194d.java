package androidx.biometric;

import ai.kudi.agent.pin.KudiPin;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.core.content.C1335a;
/* compiled from: FingerprintDialogFragment.java */
/* renamed from: androidx.biometric.d */
/* loaded from: classes2.dex */
public class C1194d extends androidx.fragment.app.h {

    /* renamed from: B */
    DialogInterface.OnClickListener f3639B;

    /* renamed from: d */
    private Bundle f3642d;

    /* renamed from: e */
    private int f3643e;

    /* renamed from: f */
    private int f3644f;

    /* renamed from: w */
    private int f3645w;

    /* renamed from: x */
    private ImageView f3646x;

    /* renamed from: y */
    private TextView f3647y;

    /* renamed from: z */
    private Context f3648z;

    /* renamed from: c */
    private HandlerC1199d f3641c = new HandlerC1199d();

    /* renamed from: A */
    private boolean f3638A = true;

    /* renamed from: C */
    private final DialogInterface.OnClickListener f3640C = new DialogInterface$OnClickListenerC1195a();

    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.d$a */
    /* loaded from: classes2.dex */
    class DialogInterface$OnClickListenerC1195a implements DialogInterface.OnClickListener {

        /* compiled from: FingerprintDialogFragment.java */
        /* renamed from: androidx.biometric.d$a$a */
        /* loaded from: classes2.dex */
        class RunnableC1196a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ DialogInterface f3650c;

            RunnableC1196a(DialogInterface dialogInterface) {
                this.f3650c = dialogInterface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1194d.this.onCancel(this.f3650c);
            }
        }

        DialogInterface$OnClickListenerC1195a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                if (Build.VERSION.SDK_INT < 21) {
                    Log.e("FingerprintDialogFrag", "Failed to check device credential. Not supported prior to L.");
                } else {
                    C1214m.m36739e("FingerprintDialogFrag", C1194d.this.getActivity(), C1194d.this.f3642d, new RunnableC1196a(dialogInterface));
                }
            }
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.d$b */
    /* loaded from: classes2.dex */
    class DialogInterface$OnClickListenerC1197b implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1197b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (C1194d.this.m36766z()) {
                C1194d.this.f3640C.onClick(dialogInterface, i);
                return;
            }
            DialogInterface.OnClickListener onClickListener = C1194d.this.f3639B;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            } else {
                Log.w("FingerprintDialogFrag", "No suitable negative button listener.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.d$c */
    /* loaded from: classes2.dex */
    public class RunnableC1198c implements Runnable {
        RunnableC1198c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1194d.this.m36776p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.d$d */
    /* loaded from: classes2.dex */
    public final class HandlerC1199d extends Handler {
        HandlerC1199d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C1194d.this.m36767y((CharSequence) message.obj);
                    return;
                case 2:
                    C1194d.this.m36768x((CharSequence) message.obj);
                    return;
                case 3:
                    C1194d.this.m36770v((CharSequence) message.obj);
                    return;
                case 4:
                    C1194d.this.m36769w();
                    return;
                case 5:
                    C1194d.this.m36776p();
                    return;
                case 6:
                    Context context = C1194d.this.getContext();
                    C1194d.this.f3638A = context != null && C1214m.m36737g(context, Build.MODEL);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static C1194d m36789A() {
        return new C1194d();
    }

    /* renamed from: C */
    private boolean m36787C(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        if (i == 2 && i2 == 1) {
            return true;
        }
        if (i != 1 || i2 == 3) {
        }
        return false;
    }

    /* renamed from: D */
    private void m36786D(int i) {
        Drawable m36775q;
        if (this.f3646x == null || Build.VERSION.SDK_INT < 23 || (m36775q = m36775q(this.f3645w, i)) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = m36775q instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) m36775q : null;
        this.f3646x.setImageDrawable(m36775q);
        if (animatedVectorDrawable != null && m36787C(this.f3645w, i)) {
            animatedVectorDrawable.start();
        }
        this.f3645w = i;
    }

    /* renamed from: o */
    private void m36777o(CharSequence charSequence) {
        TextView textView = this.f3647y;
        if (textView != null) {
            textView.setTextColor(this.f3643e);
            if (charSequence != null) {
                this.f3647y.setText(charSequence);
            } else {
                this.f3647y.setText(C1212k.fingerprint_error_lockout);
            }
        }
        this.f3641c.postDelayed(new RunnableC1198c(), m36773s(this.f3648z));
    }

    /* renamed from: q */
    private Drawable m36775q(int i, int i2) {
        int i3;
        if (i == 0 && i2 == 1) {
            i3 = C1209h.fingerprint_dialog_fp_to_error;
        } else if (i == 1 && i2 == 2) {
            i3 = C1209h.fingerprint_dialog_fp_to_error;
        } else if (i == 2 && i2 == 1) {
            i3 = C1209h.fingerprint_dialog_error_to_fp;
        } else if (i != 1 || i2 != 3) {
            return null;
        } else {
            i3 = C1209h.fingerprint_dialog_error_to_fp;
        }
        return this.f3648z.getDrawable(i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m36773s(Context context) {
        return (context == null || !C1214m.m36737g(context, Build.MODEL)) ? 2000 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private int m36771u(int i) {
        TypedValue typedValue = new TypedValue();
        this.f3648z.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m36770v(CharSequence charSequence) {
        if (this.f3638A) {
            m36776p();
        } else {
            m36777o(charSequence);
        }
        this.f3638A = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m36769w() {
        m36786D(1);
        TextView textView = this.f3647y;
        if (textView != null) {
            textView.setTextColor(this.f3644f);
            this.f3647y.setText(this.f3648z.getString(C1212k.fingerprint_dialog_touch_sensor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m36768x(CharSequence charSequence) {
        m36786D(2);
        this.f3641c.removeMessages(4);
        TextView textView = this.f3647y;
        if (textView != null) {
            textView.setTextColor(this.f3643e);
            this.f3647y.setText(charSequence);
        }
        HandlerC1199d handlerC1199d = this.f3641c;
        handlerC1199d.sendMessageDelayed(handlerC1199d.obtainMessage(3), m36773s(this.f3648z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m36767y(CharSequence charSequence) {
        m36786D(2);
        this.f3641c.removeMessages(4);
        TextView textView = this.f3647y;
        if (textView != null) {
            textView.setTextColor(this.f3643e);
            this.f3647y.setText(charSequence);
        }
        HandlerC1199d handlerC1199d = this.f3641c;
        handlerC1199d.sendMessageDelayed(handlerC1199d.obtainMessage(4), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public boolean m36766z() {
        return this.f3642d.getBoolean("allow_device_credential");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m36788B(DialogInterface.OnClickListener onClickListener) {
        this.f3639B = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C1200e c1200e = (C1200e) getFragmentManager().m35938g0("FingerprintHelperFragment");
        if (c1200e != null) {
            c1200e.m36759l(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f3648z = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3643e = m36771u(16844099);
        } else {
            this.f3643e = C1335a.m36324d(context, C1208g.biometric_error_color);
        }
        this.f3644f = m36771u(16842808);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog onCreateDialog(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && this.f3642d == null) {
            this.f3642d = bundle.getBundle("SavedBundle");
        }
        DialogInterfaceC0936d.C0937a c0937a = new DialogInterfaceC0936d.C0937a(getContext());
        c0937a.setTitle(this.f3642d.getCharSequence(KudiPin.KUDI_PIN_TITLE));
        View inflate = LayoutInflater.from(c0937a.getContext()).inflate(C1211j.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1210i.fingerprint_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(C1210i.fingerprint_description);
        CharSequence charSequence2 = this.f3642d.getCharSequence("subtitle");
        if (TextUtils.isEmpty(charSequence2)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        CharSequence charSequence3 = this.f3642d.getCharSequence("description");
        if (TextUtils.isEmpty(charSequence3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(charSequence3);
        }
        this.f3646x = (ImageView) inflate.findViewById(C1210i.fingerprint_icon);
        this.f3647y = (TextView) inflate.findViewById(C1210i.fingerprint_error);
        if (m36766z()) {
            charSequence = getString(C1212k.confirm_device_credential_password);
        } else {
            charSequence = this.f3642d.getCharSequence("negative_text");
        }
        c0937a.setNegativeButton(charSequence, new DialogInterface$OnClickListenerC1197b());
        c0937a.setView(inflate);
        DialogInterfaceC0936d create = c0937a.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.f3641c.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.f3645w = 0;
        m36786D(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("SavedBundle", this.f3642d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public void m36776p() {
        if (getFragmentManager() == null) {
            Log.e("FingerprintDialogFrag", "Failed to dismiss fingerprint dialog fragment. Fragment manager was null.");
        } else {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Handler m36774r() {
        return this.f3641c;
    }

    public void setBundle(Bundle bundle) {
        this.f3642d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public CharSequence m36772t() {
        return this.f3642d.getCharSequence("negative_text");
    }
}
