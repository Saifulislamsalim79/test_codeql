package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p201g.p227h.p238l.C7685c;
import p201g.p227h.p238l.InterfaceC7753r;
/* compiled from: TextViewOnReceiveContentListener.java */
/* renamed from: androidx.core.widget.j */
/* loaded from: classes2.dex */
public final class C1400j implements InterfaceC7753r {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextViewOnReceiveContentListener.java */
    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: classes2.dex */
    public static final class C1401a {
        /* renamed from: a */
        static CharSequence m36078a(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextViewOnReceiveContentListener.java */
    /* renamed from: androidx.core.widget.j$b */
    /* loaded from: classes2.dex */
    public static final class C1402b {
        /* renamed from: a */
        static CharSequence m36077a(Context context, ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    private static CharSequence m36080b(Context context, ClipData.Item item, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1401a.m36078a(context, item, i);
        }
        return C1402b.m36077a(context, item, i);
    }

    /* renamed from: c */
    private static void m36079c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // p201g.p227h.p238l.InterfaceC7753r
    /* renamed from: a */
    public C7685c mo17572a(View view, C7685c c7685c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c7685c);
        }
        if (c7685c.m17829d() == 2) {
            return c7685c;
        }
        ClipData m17831b = c7685c.m17831b();
        int m17830c = c7685c.m17830c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < m17831b.getItemCount(); i++) {
            CharSequence m36080b = m36080b(context, m17831b.getItemAt(i), m17830c);
            if (m36080b != null) {
                if (!z) {
                    m36079c(editable, m36080b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m36080b);
                }
            }
        }
        return null;
    }
}
