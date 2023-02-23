package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import java.io.InputStream;
import p576m.C14353l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactsPhotoRequestHandler.java */
/* renamed from: com.squareup.picasso.f */
/* loaded from: classes2.dex */
public class C7337f extends AbstractC7377y {

    /* renamed from: b */
    private static final UriMatcher f17371b;

    /* renamed from: a */
    private final Context f17372a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f17371b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f17371b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f17371b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f17371b.addURI("com.android.contacts", "contacts/#", 3);
        f17371b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7337f(Context context) {
        this.f17372a = context;
    }

    /* renamed from: j */
    private InputStream m18936j(C7373w c7373w) throws IOException {
        ContentResolver contentResolver = this.f17372a.getContentResolver();
        Uri uri = c7373w.f17482d;
        int match = f17371b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        Uri uri = c7373w.f17482d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f17371b.match(c7373w.f17482d) != -1;
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        InputStream m18936j = m18936j(c7373w);
        if (m18936j == null) {
            return null;
        }
        return new AbstractC7377y.C7378a(C14353l.m2014k(m18936j), C7360t.EnumC7366e.DISK);
    }
}
