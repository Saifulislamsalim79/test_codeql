package io.intercom.com.bumptech.glide.load.p398m;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamLocalUriFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.l */
/* loaded from: classes3.dex */
public class C10648l extends AbstractC10646j<InputStream> {

    /* renamed from: f */
    private static final UriMatcher f24448f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f24448f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f24448f.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f24448f.addURI("com.android.contacts", "contacts/#/photo", 2);
        f24448f.addURI("com.android.contacts", "contacts/#", 3);
        f24448f.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f24448f.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C10648l(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: h */
    private InputStream m12570h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f24448f.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m12569i(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m12569i(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: i */
    private InputStream m12569i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: a */
    public Class<InputStream> mo12474a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10646j
    /* renamed from: f */
    public void mo12574c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10646j
    /* renamed from: g */
    public InputStream mo12573d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream m12570h = m12570h(uri, contentResolver);
        if (m12570h != null) {
            return m12570h;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
