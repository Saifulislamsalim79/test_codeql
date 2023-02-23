package p425j.p434c.p435a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
/* compiled from: LinkResolverDef.java */
/* renamed from: j.c.a.d */
/* loaded from: classes3.dex */
public class C11177d implements InterfaceC11176c {
    /* renamed from: b */
    private static Uri m11448b(String str) {
        Uri parse = Uri.parse(str);
        return TextUtils.isEmpty(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : parse;
    }

    @Override // p425j.p434c.p435a.InterfaceC11176c
    /* renamed from: a */
    public void mo11449a(View view, String str) {
        Uri m11448b = m11448b(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", m11448b);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
