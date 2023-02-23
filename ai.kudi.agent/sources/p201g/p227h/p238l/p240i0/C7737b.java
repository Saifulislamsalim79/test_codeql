package p201g.p227h.p238l.p240i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: InputConnectionCompat.java */
/* renamed from: g.h.l.i0.b */
/* loaded from: classes2.dex */
public final class C7737b {

    /* compiled from: InputConnectionCompat.java */
    /* renamed from: g.h.l.i0.b$a */
    /* loaded from: classes2.dex */
    class C7738a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7740c f18494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7738a(InputConnection inputConnection, boolean z, InterfaceC7740c interfaceC7740c) {
            super(inputConnection, z);
            this.f18494a = interfaceC7740c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f18494a.mo17609a(C7741c.m17603f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    /* renamed from: g.h.l.i0.b$b */
    /* loaded from: classes2.dex */
    class C7739b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7740c f18495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7739b(InputConnection inputConnection, boolean z, InterfaceC7740c interfaceC7740c) {
            super(inputConnection, z);
            this.f18495a = interfaceC7740c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C7737b.m17610b(str, bundle, this.f18495a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    /* renamed from: g.h.l.i0.b$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC7740c {
        /* renamed from: a */
        boolean mo17609a(C7741c c7741c, int i, Bundle bundle);
    }

    /* renamed from: a */
    public static InputConnection m17611a(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC7740c interfaceC7740c) {
        if (inputConnection != null) {
            if (editorInfo != null) {
                if (interfaceC7740c != null) {
                    if (Build.VERSION.SDK_INT >= 25) {
                        return new C7738a(inputConnection, false, interfaceC7740c);
                    }
                    return C7735a.m17620a(editorInfo).length == 0 ? inputConnection : new C7739b(inputConnection, false, interfaceC7740c);
                }
                throw new IllegalArgumentException("onCommitContentListener must be non-null");
            }
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        throw new IllegalArgumentException("inputConnection must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: b */
    static boolean m17610b(String str, Bundle bundle, InterfaceC7740c interfaceC7740c) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    r0 = interfaceC7740c.mo17609a(new C7741c(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r0, null);
                }
                return r0;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }
}
