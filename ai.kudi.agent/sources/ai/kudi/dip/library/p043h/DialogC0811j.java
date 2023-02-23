package ai.kudi.dip.library.p043h;

import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import ai.kudi.dip.library.bottomSheets.models.C0760b;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C1335a;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: KudiOneInputDialog.kt */
/* renamed from: ai.kudi.dip.library.h.j */
/* loaded from: classes2.dex */
public class DialogC0811j extends DialogC4547a {

    /* renamed from: f */
    public static final C0812a f2281f = new C0812a(null);

    /* renamed from: c */
    private final C0760b f2282c;

    /* renamed from: d */
    private InterfaceC11767l<? super String, C13666w> f2283d;

    /* renamed from: e */
    private KudiButton f2284e;

    /* compiled from: KudiOneInputDialog.kt */
    /* renamed from: ai.kudi.dip.library.h.j$a */
    /* loaded from: classes2.dex */
    public static final class C0812a {
        private C0812a() {
        }

        public /* synthetic */ C0812a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final DialogC0811j m37957a(Context context, C0760b c0760b) {
            l.f(context, "context");
            l.f(c0760b, "option");
            return new DialogC0811j(context, c0760b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0811j(Context context, C0760b c0760b) {
        super(context);
        l.f(context, "context");
        l.f(c0760b, "option");
        this.f2282c = c0760b;
        View inflate = LayoutInflater.from(context).inflate(C0786e.dialog_kudi_one_input, (ViewGroup) null, false);
        setContentView(inflate);
        l.e(inflate, "view");
        m37960f(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m37959g(DialogC0811j dialogC0811j, KudiInputField kudiInputField, View view) {
        String text;
        l.f(dialogC0811j, "this$0");
        InterfaceC11767l<String, C13666w> m37964b = dialogC0811j.m37964b();
        if (m37964b == null) {
            return;
        }
        String str = "";
        if (kudiInputField != null && (text = kudiInputField.getText()) != null) {
            str = text;
        }
        m37964b.invoke(str);
    }

    /* renamed from: a */
    public final void m37965a() {
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: b */
    public final InterfaceC11767l<String, C13666w> m37964b() {
        return this.f2283d;
    }

    /* renamed from: d */
    public DialogC0811j m37962d(InterfaceC11767l<? super String, C13666w> interfaceC11767l) {
        this.f2283d = interfaceC11767l;
        return this;
    }

    /* renamed from: e */
    public final void m37961e() {
        if (isShowing()) {
            return;
        }
        show();
    }

    /* renamed from: f */
    public final void m37960f(View view) {
        TextView kudiButtonTextView;
        l.f(view, "view");
        TextView textView = (TextView) findViewById(C0785d.tv_desc);
        TextView textView2 = (TextView) findViewById(C0785d.tv_title);
        TextView textView3 = (TextView) findViewById(C0785d.tv_desc);
        final KudiInputField kudiInputField = (KudiInputField) findViewById(C0785d.et_input);
        this.f2284e = (KudiButton) findViewById(C0785d.btn_action);
        if (textView != null) {
            textView.setText(this.f2282c.m38041e());
        }
        if (textView2 != null) {
            textView2.setText(this.f2282c.m38041e());
        }
        if (textView2 != null) {
            textView2.setTextColor(C1335a.m36324d(getContext(), this.f2282c.m38040f()));
        }
        if (textView3 != null) {
            textView3.setText(this.f2282c.m38044b());
        }
        if (textView3 != null) {
            textView3.setTextColor(C1335a.m36324d(getContext(), this.f2282c.m38043c()));
        }
        if (kudiInputField != null) {
            kudiInputField.setHint(this.f2282c.m38042d());
        }
        KudiButton kudiButton = this.f2284e;
        if (kudiButton != null) {
            kudiButton.setText(this.f2282c.m38045a());
        }
        KudiButton kudiButton2 = this.f2284e;
        if (kudiButton2 != null && (kudiButtonTextView = kudiButton2.getKudiButtonTextView()) != null) {
            kudiButtonTextView.setTextColor(C1335a.m36324d(getContext(), C0755a.kudiButtonDrawableColor));
        }
        KudiButton kudiButton3 = this.f2284e;
        if (kudiButton3 == null) {
            return;
        }
        kudiButton3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DialogC0811j.m37959g(DialogC0811j.this, kudiInputField, view2);
            }
        });
    }

    /* renamed from: h */
    public final void m37958h(boolean z) {
        KudiButton kudiButton = (KudiButton) findViewById(C0785d.btn_action);
        if (kudiButton != null) {
            kudiButton.setEnabled(z);
        }
        KudiInputField kudiInputField = (KudiInputField) findViewById(C0785d.et_input);
        EditText editText = kudiInputField == null ? null : kudiInputField.getEditText();
        if (editText != null) {
            editText.setEnabled(z);
        }
        if (z) {
            if (kudiButton == null) {
                return;
            }
            kudiButton.m38033e();
        } else if (kudiButton == null) {
        } else {
            kudiButton.m38032f();
        }
    }
}
