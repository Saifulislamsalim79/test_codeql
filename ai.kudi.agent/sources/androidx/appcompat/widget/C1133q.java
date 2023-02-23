package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import p201g.p227h.p238l.C7685c;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p240i0.C7737b;
import p201g.p227h.p238l.p240i0.C7741c;
/* compiled from: AppCompatReceiveContentHelper.java */
/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes2.dex */
final class C1133q {

    /* compiled from: AppCompatReceiveContentHelper.java */
    /* renamed from: androidx.appcompat.widget.q$a */
    /* loaded from: classes2.dex */
    class C1134a implements C7737b.InterfaceC7740c {

        /* renamed from: a */
        final /* synthetic */ View f3456a;

        C1134a(View view) {
            this.f3456a = view;
        }

        @Override // p201g.p227h.p238l.p240i0.C7737b.InterfaceC7740c
        /* renamed from: a */
        public boolean mo17609a(C7741c c7741c, int i, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                try {
                    c7741c.m17605d();
                    InputContentInfo inputContentInfo = (InputContentInfo) c7741c.m17604e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
            C7685c.C7686a c7686a = new C7685c.C7686a(new ClipData(c7741c.m17607b(), new ClipData.Item(c7741c.m17608a())), 2);
            c7686a.m17824d(c7741c.m17606c());
            c7686a.m17826b(bundle);
            return C7759x.m17518f0(this.f3456a, c7686a.m17827a()) == null;
        }
    }

    /* compiled from: AppCompatReceiveContentHelper.java */
    /* renamed from: androidx.appcompat.widget.q$b */
    /* loaded from: classes2.dex */
    private static final class C1135b {
        /* renamed from: a */
        static boolean m37049a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C7759x.m17518f0(textView, new C7685c.C7686a(dragEvent.getClipData(), 3).m17827a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m37048b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C7759x.m17518f0(view, new C7685c.C7686a(dragEvent.getClipData(), 3).m17827a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7737b.InterfaceC7740c m37053a(View view) {
        return new C1134a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m37052b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && C7759x.m17557F(view) != null) {
            Activity m37050d = m37050d(view);
            if (m37050d == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C1135b.m37049a(dragEvent, (TextView) view, m37050d);
                    }
                    return C1135b.m37048b(dragEvent, view, m37050d);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m37051c(TextView textView, int i) {
        if ((i == 16908322 || i == 16908337) && C7759x.m17557F(textView) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C7685c.C7686a c7686a = new C7685c.C7686a(primaryClip, 1);
                c7686a.m17825c(i != 16908322 ? 1 : 0);
                C7759x.m17518f0(textView, c7686a.m17827a());
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static Activity m37050d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
