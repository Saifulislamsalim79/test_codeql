package ai.kudi.dip.library.button;

import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0785d;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import com.squareup.picasso.C7360t;
import com.squareup.picasso.C7376x;
import com.squareup.picasso.InterfaceC7336e;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p549l0.C13277t;
/* compiled from: BaseUploadButton.kt */
/* renamed from: ai.kudi.dip.library.button.e */
/* loaded from: classes2.dex */
public abstract class AbstractC0765e extends LinearLayout {

    /* renamed from: A */
    private final int f2166A;

    /* renamed from: B */
    private final int f2167B;

    /* renamed from: C */
    private final Drawable f2168C;

    /* renamed from: D */
    private final Drawable f2169D;

    /* renamed from: E */
    private InterfaceC11756a<C13666w> f2170E;

    /* renamed from: F */
    private InterfaceC11756a<C13666w> f2171F;

    /* renamed from: G */
    private boolean f2172G;

    /* renamed from: c */
    private final TextView f2173c;

    /* renamed from: d */
    private final LinearLayout f2174d;

    /* renamed from: e */
    private final ImageView f2175e;

    /* renamed from: f */
    private final TextView f2176f;

    /* renamed from: w */
    private final LinearLayout f2177w;

    /* renamed from: x */
    private final TextView f2178x;

    /* renamed from: y */
    private final LinearLayout f2179y;

    /* renamed from: z */
    private final TextView f2180z;

    /* compiled from: BaseUploadButton.kt */
    /* renamed from: ai.kudi.dip.library.button.e$a */
    /* loaded from: classes2.dex */
    public static final class C0766a implements InterfaceC7336e {
        C0766a() {
        }

        @Override // com.squareup.picasso.InterfaceC7336e
        public void onError(Exception exc) {
            if (exc == null) {
                return;
            }
            exc.printStackTrace();
        }

        @Override // com.squareup.picasso.InterfaceC7336e
        public void onSuccess() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0765e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        int i2 = C0756b.im_circle_placeholder;
        this.f2166A = i2;
        this.f2167B = i2;
        this.f2168C = C1335a.m36322f(context, i2);
        this.f2169D = C1335a.m36322f(context, this.f2167B);
        View.inflate(context, mo38013i(), this);
        View findViewById = findViewById(C0785d.tv_button_label);
        l.e(findViewById, "findViewById(R.id.tv_button_label)");
        this.f2173c = (TextView) findViewById;
        View findViewById2 = findViewById(C0785d.ll_btn_container);
        l.e(findViewById2, "findViewById(R.id.ll_btn_container)");
        this.f2174d = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(C0785d.iv_button_img);
        l.e(findViewById3, "findViewById(R.id.iv_button_img)");
        this.f2175e = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0785d.tv_button_text);
        l.e(findViewById4, "findViewById(R.id.tv_button_text)");
        this.f2176f = (TextView) findViewById4;
        View findViewById5 = findViewById(C0785d.ll_uploading_wrapper);
        l.e(findViewById5, "findViewById(R.id.ll_uploading_wrapper)");
        this.f2177w = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(C0785d.tv_uploading_label);
        l.e(findViewById6, "findViewById(R.id.tv_uploading_label)");
        this.f2178x = (TextView) findViewById6;
        View findViewById7 = findViewById(C0785d.ll_change_upload_btn);
        l.e(findViewById7, "findViewById(R.id.ll_change_upload_btn)");
        this.f2179y = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(C0785d.tv_change_upload_btn_text);
        l.e(findViewById8, "findViewById(R.id.tv_change_upload_btn_text)");
        this.f2180z = (TextView) findViewById8;
        this.f2174d.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.button.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0765e.m38025a(AbstractC0765e.this, view);
            }
        });
        this.f2179y.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.button.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0765e.m38024b(AbstractC0765e.this, view);
            }
        });
        m38023c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m38025a(AbstractC0765e abstractC0765e, View view) {
        l.f(abstractC0765e, "this$0");
        InterfaceC11756a<C13666w> interfaceC11756a = abstractC0765e.f2170E;
        l.d(interfaceC11756a);
        interfaceC11756a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m38024b(AbstractC0765e abstractC0765e, View view) {
        l.f(abstractC0765e, "this$0");
        InterfaceC11756a<C13666w> interfaceC11756a = abstractC0765e.f2171F;
        l.d(interfaceC11756a);
        interfaceC11756a.invoke();
    }

    /* renamed from: c */
    private final void m38023c() {
        this.f2173c.setTypeface(Typeface.DEFAULT);
        this.f2176f.setTypeface(Typeface.DEFAULT);
        this.f2178x.setTypeface(Typeface.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m38014m(AbstractC0765e abstractC0765e, boolean z, String str, String str2) {
        l.f(abstractC0765e, "this$0");
        l.f(str, "$uploadText");
        l.f(str2, "$changeButtonText");
        abstractC0765e.setButtonWrapperBackground(17170445);
        abstractC0765e.setButtonTextVisibility(!z);
        abstractC0765e.setUploadingWrapperVisibility(z);
        abstractC0765e.setUploadTextVisibility(z);
        abstractC0765e.setUploadingText(str);
        abstractC0765e.m38016k(z);
        abstractC0765e.setChangeButtonText(str2);
    }

    /* renamed from: d */
    public InterfaceC7336e m38022d() {
        return new C0766a();
    }

    /* renamed from: e */
    public void m38021e() {
        this.f2177w.setBackground(C1335a.m36322f(getContext(), C0756b.drawable_border_error));
    }

    public String getButtonLabel() {
        CharSequence m5414M0;
        String obj = this.f2173c.getText().toString();
        if (obj != null) {
            m5414M0 = C13277t.m5414M0(obj);
            return m5414M0.toString();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public String getButtonText() {
        CharSequence m5414M0;
        String obj = this.f2176f.getText().toString();
        if (obj != null) {
            m5414M0 = C13277t.m5414M0(obj);
            return m5414M0.toString();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public final Drawable getErrorDrawable() {
        return this.f2169D;
    }

    protected final int getErrorPlaceholder() {
        return this.f2167B;
    }

    public final boolean getFinalState() {
        return this.f2172G;
    }

    public ImageView getIconImage() {
        return this.f2175e;
    }

    public final Drawable getPlaceHolderDrawable() {
        return this.f2168C;
    }

    protected final int getPlaceholder() {
        return this.f2166A;
    }

    public String getUploadingText() {
        CharSequence m5414M0;
        String obj = this.f2178x.getText().toString();
        if (obj != null) {
            m5414M0 = C13277t.m5414M0(obj);
            return m5414M0.toString();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: i */
    public abstract int mo38013i();

    /* renamed from: j */
    public void m38017j(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "callback");
        this.f2171F = interfaceC11756a;
    }

    /* renamed from: k */
    public void m38016k(boolean z) {
        if (z) {
            this.f2179y.setVisibility(0);
        } else {
            this.f2179y.setVisibility(8);
        }
    }

    /* renamed from: l */
    public final void m38015l(final boolean z, final String str, final String str2) {
        l.f(str, "uploadText");
        l.f(str2, "changeButtonText");
        setFinalState(true);
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        ((Activity) context).runOnUiThread(new Runnable() { // from class: ai.kudi.dip.library.button.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0765e.m38014m(AbstractC0765e.this, z, str, str2);
            }
        });
    }

    public void setButtonLabel(String str) {
        l.f(str, "label");
        this.f2173c.setText(str);
    }

    public void setButtonText(String str) {
        l.f(str, AttributeType.TEXT);
        this.f2176f.setText(str);
    }

    public void setButtonTextVisibility(boolean z) {
        if (z) {
            this.f2176f.setVisibility(0);
        } else {
            this.f2176f.setVisibility(8);
        }
    }

    public void setButtonWrapperBackground(int i) {
        this.f2174d.setBackground(C1335a.m36322f(getContext(), i));
    }

    public void setChangeButtonText(String str) {
        l.f(str, AttributeType.TEXT);
        this.f2180z.setText(str);
    }

    public final void setFinalState(boolean z) {
        this.f2172G = z;
    }

    public void setIconImageWithDrawable(int i) {
        this.f2175e.setImageResource(i);
    }

    public void setIconImageWithUrl(Uri uri) {
        if (uri != null) {
            C7376x m18879i = C7360t.m18881g().m18879i(uri);
            Drawable drawable = this.f2168C;
            l.d(drawable);
            m18879i.m18845g(drawable);
            Drawable drawable2 = this.f2169D;
            l.d(drawable2);
            m18879i.m18849c(drawable2);
            m18879i.m18846f(this.f2175e, m38022d());
            return;
        }
        this.f2175e.setImageResource(this.f2167B);
    }

    public void setOnButtonClickListener(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "callback");
        this.f2170E = interfaceC11756a;
    }

    public void setUploadTextVisibility(boolean z) {
        if (z) {
            this.f2178x.setVisibility(0);
        } else {
            this.f2178x.setVisibility(8);
        }
    }

    public void setUploadingText(String str) {
        l.f(str, "label");
        this.f2178x.setText(str);
    }

    public void setUploadingWrapperVisibility(boolean z) {
        if (z) {
            this.f2177w.setVisibility(0);
        } else {
            this.f2177w.setVisibility(8);
        }
    }
}
