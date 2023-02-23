package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p201g.p227h.p237k.C7675h;
/* compiled from: AppCompatTextClassifierHelper.java */
/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes2.dex */
final class C1156u {

    /* renamed from: a */
    private TextView f3518a;

    /* renamed from: b */
    private TextClassifier f3519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1156u(TextView textView) {
        C7675h.m17866f(textView);
        this.f3518a = textView;
    }

    /* renamed from: a */
    public TextClassifier m36985a() {
        TextClassifier textClassifier = this.f3519b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f3518a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m36984b(TextClassifier textClassifier) {
        this.f3519b = textClassifier;
    }
}
