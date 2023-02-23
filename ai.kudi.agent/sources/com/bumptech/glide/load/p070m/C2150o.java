package com.bumptech.glide.load.p070m;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.o */
/* loaded from: classes2.dex */
public class C2150o extends AbstractC2145l<InputStream> {

    /* renamed from: f */
    private static final UriMatcher f6452f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6452f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f6452f.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f6452f.addURI("com.android.contacts", "contacts/#/photo", 2);
        f6452f.addURI("com.android.contacts", "contacts/#", 3);
        f6452f.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f6452f.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C2150o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: h */
    private InputStream m33626h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f6452f.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m33625i(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m33625i(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: i */
    private InputStream m33625i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<InputStream> mo33507a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2145l
    /* renamed from: f */
    public void mo33630c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2145l
    /* renamed from: g */
    public InputStream mo33629d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream m33626h = m33626h(uri, contentResolver);
        if (m33626h != null) {
            return m33626h;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
