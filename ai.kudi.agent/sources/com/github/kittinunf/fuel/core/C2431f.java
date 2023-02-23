package com.github.kittinunf.fuel.core;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.github.kittinunf.fuel.core.InterfaceC2427d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
/* compiled from: DefaultHook.kt */
/* renamed from: com.github.kittinunf.fuel.core.f */
/* loaded from: classes2.dex */
public final class C2431f implements InterfaceC2427d.InterfaceC2428a {
    @Override // com.github.kittinunf.fuel.core.InterfaceC2427d.InterfaceC2428a
    /* renamed from: a */
    public void mo32894a(InterfaceC2464q interfaceC2464q, IOException iOException) {
        kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
        kotlin.e0.d.l.g(iOException, "exception");
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2427d.InterfaceC2428a
    /* renamed from: b */
    public void mo32893b(InterfaceC2464q interfaceC2464q) {
        kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2427d.InterfaceC2428a
    /* renamed from: c */
    public InputStream mo32892c(InterfaceC2464q interfaceC2464q, InputStream inputStream) {
        kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
        return inputStream;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2427d.InterfaceC2428a
    /* renamed from: d */
    public void mo32891d(HttpURLConnection httpURLConnection, InterfaceC2464q interfaceC2464q) {
        kotlin.e0.d.l.g(httpURLConnection, "connection");
        kotlin.e0.d.l.g(interfaceC2464q, TransactionRequest.TYPE_REQUEST);
    }
}
