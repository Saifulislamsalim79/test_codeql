package ai.kudi.agent.biometric.security;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.firebase.crashlytics.C5325g;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13254d;
import p590o.p591a.Timber;
/* compiled from: PFSecurityUtils.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\fH\u0016J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0003J*\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\"\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002J$\u0010 \u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\fH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0002R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/biometric/security/PFSecurityUtils;", "Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "firebase", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "cipherInstance", "Ljavax/crypto/Cipher;", "getCipherInstance", "()Ljavax/crypto/Cipher;", "getFirebase", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "decode", "", "encodedString", "cipher", "alias", "deleteKey", "", "encode", "context", "Landroid/content/Context;", MetricTracker.Object.INPUT, "isAuthorizationRequired", "", "generateKey", "keystoreAlias", "isAuthenticationRequired", "generateKeyIfNecessary", "keyStore", "Ljava/security/KeyStore;", "getEncodeCipher", "initDecodeCipher", "initEncodeCipher", "isKeystoreContainAlias", "loadKeyStore", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PFSecurityUtils implements IPFSecurityUtils {
    public static final Companion Companion;
    private final C5325g firebase;

    /* compiled from: PFSecurityUtils.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/biometric/security/PFSecurityUtils$Companion;", "", "()V", "getInstance", "Lai/kudi/agent/biometric/security/PFSecurityUtils;", "firebase", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PFSecurityUtils getInstance(C5325g c5325g) {
            Log_OC.getArray(c5325g, "firebase");
            PFSecurityUtils $r2 = new PFSecurityUtils(c5325g);
            return $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public PFSecurityUtils(C5325g c5325g) {
        Log_OC.getArray(c5325g, "firebase");
        this.firebase = c5325g;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String decode(String str, Cipher cipher) throws PFSecurityException {
        try {
            byte[] $r3 = cipher.doFinal(Base64.decode(str, 2));
            Log_OC.loadImage($r3, "cipher.doFinal(bytes)");
            Charset $r4 = C13254d.f29413a;
            String $r1 = new String($r3, $r4);
            return $r1;
        } catch (BadPaddingException $r5) {
            String $r12 = $r5.getMessage();
            String $r13 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r12);
            PFSecurityUtilsErrorCodes $r7 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r7.getERROR_DEENCODING();
            Integer $r8 = Integer.valueOf($i0);
            PFSecurityException $r6 = new PFSecurityException($r13, $r8);
            Timber.reorder($r6);
            C5325g $r9 = this.firebase;
            $r9.m25120d($r6);
            return "";
        } catch (IllegalBlockSizeException $r10) {
            String $r14 = $r10.getMessage();
            String $r15 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r14);
            PFSecurityUtilsErrorCodes $r72 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r72.getERROR_DEENCODING();
            Integer $r82 = Integer.valueOf($i02);
            PFSecurityException $r62 = new PFSecurityException($r15, $r82);
            Timber.reorder($r62);
            C5325g $r92 = this.firebase;
            $r92.m25120d($r62);
            return "";
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean generateKey(Context context, String str, boolean z) {
        boolean $z0 = generateKey(str, z);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean generateKey(String str, boolean z) {
        try {
            KeyPairGenerator $r2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            KeyGenParameterSpec.Builder r9 = new KeyGenParameterSpec.Builder(str, 3);
            String[] $r4 = {"SHA-256", "SHA-512"};
            KeyGenParameterSpec.Builder $r3 = r9.setDigests($r4);
            String[] $r42 = {"OAEPPadding"};
            AlgorithmParameterSpec $r5 = $r3.setEncryptionPaddings($r42).setUserAuthenticationRequired(z).build();
            AlgorithmParameterSpec r10 = $r5;
            $r2.initialize(r10);
            $r2.generateKeyPair();
            return true;
        } catch (InvalidAlgorithmParameterException $r6) {
            $r6.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException $r8) {
            $r8.printStackTrace();
            return false;
        } catch (NoSuchProviderException $r7) {
            $r7.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e A[Catch: KeyStoreException -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #0 {KeyStoreException -> 0x0018, blocks: (B:9:0x000e, B:4:0x0004), top: B:20:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean generateKeyIfNecessary(android.content.Context r4, java.security.KeyStore r5, java.lang.String r6, boolean r7) {
        /*
            r3 = this;
            if (r5 != 0) goto L4
        L2:
            r0 = 0
            goto Lc
        L4:
            boolean r0 = r5.containsAlias(r6)     // Catch: java.security.KeyStoreException -> L18
            r1 = 1
            if (r0 != r1) goto L2
            r0 = 1
        Lc:
            if (r0 != 0) goto L1e
            boolean r7 = r3.generateKey(r4, r6, r7)     // Catch: java.security.KeyStoreException -> L18
            if (r7 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
        L18:
            r2 = move-exception
            r2.printStackTrace()
            r1 = 0
            return r1
        L1e:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.biometric.security.PFSecurityUtils.generateKeyIfNecessary(android.content.Context, java.security.KeyStore, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Cipher getCipherInstance() throws PFSecurityException {
        try {
            Cipher $r1 = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            return $r1;
        } catch (NoSuchAlgorithmException $r8) {
            String $r4 = $r8.getMessage();
            String $r42 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r4);
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_GET_CIPHER_INSTANCE();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r3 = new PFSecurityException($r42, $r6);
            Timber.reorder($r3);
            C5325g $r7 = this.firebase;
            $r7.m25120d($r3);
            return null;
        } catch (NoSuchPaddingException $r2) {
            String $r43 = $r2.getMessage();
            String $r44 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r43);
            PFSecurityUtilsErrorCodes $r52 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r52.getERROR_GET_CIPHER_INSTANCE();
            Integer $r62 = Integer.valueOf($i02);
            PFSecurityException $r32 = new PFSecurityException($r44, $r62);
            Timber.reorder($r32);
            C5325g $r72 = this.firebase;
            $r72.m25120d($r32);
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Cipher getEncodeCipher(Context context, String str, boolean z) throws PFSecurityException {
        Cipher $r3 = getCipherInstance();
        KeyStore $r4 = loadKeyStore();
        generateKeyIfNecessary(context, $r4, str, z);
        initEncodeCipher($r3, str, $r4);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initDecodeCipher(Cipher cipher, String str) throws PFSecurityException {
        try {
            KeyStore $r3 = loadKeyStore();
            Key $r5 = $r3 == null ? null : $r3.getKey(str, null);
            boolean $z0 = $r5 instanceof PrivateKey;
            PrivateKey $r4 = $z0 ? (PrivateKey) $r5 : null;
            if (cipher == null) {
                return;
            }
            cipher.init(2, $r4);
        } catch (InvalidKeyException $r6) {
            String $r2 = $r6.getMessage();
            String $r22 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r2);
            PFSecurityUtilsErrorCodes $r8 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r8.getERROR_INIT_DECODE_CIPHER();
            Integer $r9 = Integer.valueOf($i0);
            PFSecurityException $r7 = new PFSecurityException($r22, $r9);
            Timber.reorder($r7);
            C5325g $r10 = this.firebase;
            $r10.m25120d($r7);
        } catch (KeyStoreException $r13) {
            String $r23 = $r13.getMessage();
            String $r24 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r23);
            PFSecurityUtilsErrorCodes $r82 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r82.getERROR_INIT_DECODE_CIPHER();
            Integer $r92 = Integer.valueOf($i02);
            PFSecurityException $r72 = new PFSecurityException($r24, $r92);
            Timber.reorder($r72);
            C5325g $r102 = this.firebase;
            $r102.m25120d($r72);
        } catch (NoSuchAlgorithmException $r12) {
            String $r25 = $r12.getMessage();
            String $r26 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r25);
            PFSecurityUtilsErrorCodes $r83 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i03 = $r83.getERROR_INIT_DECODE_CIPHER();
            Integer $r93 = Integer.valueOf($i03);
            PFSecurityException $r73 = new PFSecurityException($r26, $r93);
            Timber.reorder($r73);
            C5325g $r103 = this.firebase;
            $r103.m25120d($r73);
        } catch (UnrecoverableKeyException $r11) {
            String $r27 = $r11.getMessage();
            String $r28 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r27);
            PFSecurityUtilsErrorCodes $r84 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i04 = $r84.getERROR_INIT_DECODE_CIPHER();
            Integer $r94 = Integer.valueOf($i04);
            PFSecurityException $r74 = new PFSecurityException($r28, $r94);
            Timber.reorder($r74);
            C5325g $r104 = this.firebase;
            $r104.m25120d($r74);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: NullPointerException -> 0x004a, InvalidAlgorithmParameterException -> 0x0079, InvalidKeyException -> 0x00aa, NoSuchAlgorithmException -> 0x00db, InvalidKeySpecException -> 0x010c, KeyStoreException -> 0x013d, TRY_ENTER, TryCatch #2 {NullPointerException -> 0x004a, InvalidAlgorithmParameterException -> 0x0079, InvalidKeyException -> 0x00aa, KeyStoreException -> 0x013d, NoSuchAlgorithmException -> 0x00db, InvalidKeySpecException -> 0x010c, blocks: (B:12:0x001d, B:16:0x0028, B:17:0x002c, B:19:0x0039, B:22:0x0043, B:11:0x0019, B:5:0x0005, B:8:0x0010), top: B:42:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: NullPointerException -> 0x004a, InvalidAlgorithmParameterException -> 0x0079, InvalidKeyException -> 0x00aa, NoSuchAlgorithmException -> 0x00db, InvalidKeySpecException -> 0x010c, KeyStoreException -> 0x013d, TRY_ENTER, TryCatch #2 {NullPointerException -> 0x004a, InvalidAlgorithmParameterException -> 0x0079, InvalidKeyException -> 0x00aa, KeyStoreException -> 0x013d, NoSuchAlgorithmException -> 0x00db, InvalidKeySpecException -> 0x010c, blocks: (B:12:0x001d, B:16:0x0028, B:17:0x002c, B:19:0x0039, B:22:0x0043, B:11:0x0019, B:5:0x0005, B:8:0x0010), top: B:42:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: NullPointerException -> 0x004a, InvalidAlgorithmParameterException -> 0x0079, InvalidKeyException -> 0x00aa, NoSuchAlgorithmException -> 0x00db, InvalidKeySpecException -> 0x010c, KeyStoreException -> 0x013d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x004a, InvalidAlgorithmParameterException -> 0x0079, InvalidKeyException -> 0x00aa, KeyStoreException -> 0x013d, NoSuchAlgorithmException -> 0x00db, InvalidKeySpecException -> 0x010c, blocks: (B:12:0x001d, B:16:0x0028, B:17:0x002c, B:19:0x0039, B:22:0x0043, B:11:0x0019, B:5:0x0005, B:8:0x0010), top: B:42:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initEncodeCipher(javax.crypto.Cipher r25, java.lang.String r26, java.security.KeyStore r27) throws ai.kudi.agent.biometric.security.PFSecurityException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.biometric.security.PFSecurityUtils.initEncodeCipher(javax.crypto.Cipher, java.lang.String, java.security.KeyStore):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final KeyStore loadKeyStore() throws PFSecurityException {
        try {
            KeyStore $r1 = KeyStore.getInstance("AndroidKeyStore");
            $r1.load(null);
            return $r1;
        } catch (IOException $r2) {
            String $r4 = $r2.getMessage();
            String $r42 = Log_OC.m10359a("Can not load keystore:", (Object) $r4);
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_LOAD_KEY_STORE();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r3 = new PFSecurityException($r42, $r6);
            Timber.reorder($r3);
            C5325g $r7 = this.firebase;
            $r7.m25120d($r3);
            return null;
        } catch (KeyStoreException $r10) {
            String $r43 = $r10.getMessage();
            String $r44 = Log_OC.m10359a("Can not load keystore:", (Object) $r43);
            PFSecurityUtilsErrorCodes $r52 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r52.getERROR_LOAD_KEY_STORE();
            Integer $r62 = Integer.valueOf($i02);
            PFSecurityException $r32 = new PFSecurityException($r44, $r62);
            Timber.reorder($r32);
            C5325g $r72 = this.firebase;
            $r72.m25120d($r32);
            return null;
        } catch (NoSuchAlgorithmException $r9) {
            String $r45 = $r9.getMessage();
            String $r46 = Log_OC.m10359a("Can not load keystore:", (Object) $r45);
            PFSecurityUtilsErrorCodes $r53 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i03 = $r53.getERROR_LOAD_KEY_STORE();
            Integer $r63 = Integer.valueOf($i03);
            PFSecurityException $r33 = new PFSecurityException($r46, $r63);
            Timber.reorder($r33);
            C5325g $r73 = this.firebase;
            $r73.m25120d($r33);
            return null;
        } catch (CertificateException $r8) {
            String $r47 = $r8.getMessage();
            String $r48 = Log_OC.m10359a("Can not load keystore:", (Object) $r47);
            PFSecurityUtilsErrorCodes $r54 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i04 = $r54.getERROR_LOAD_KEY_STORE();
            Integer $r64 = Integer.valueOf($i04);
            PFSecurityException $r34 = new PFSecurityException($r48, $r64);
            Timber.reorder($r34);
            C5325g $r74 = this.firebase;
            $r74.m25120d($r34);
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public String decode(String str, String str2) throws PFSecurityException {
        byte[] $r4;
        Log_OC.getArray(str, "alias");
        Log_OC.getArray(str2, "encodedString");
        try {
            Cipher $r3 = getCipherInstance();
            initDecodeCipher($r3, str);
            byte[] $r42 = Base64.decode(str2, 2);
            if ($r3 == null || ($r4 = $r3.doFinal($r42)) == null) {
                return null;
            }
            Charset $r5 = C13254d.f29413a;
            String $r1 = new String($r4, $r5);
            return $r1;
        } catch (IllegalStateException $r6) {
            String $r12 = $r6.getMessage();
            String $r13 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r12);
            PFSecurityUtilsErrorCodes $r8 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r8.getERROR_DEENCODING();
            Integer $r9 = Integer.valueOf($i0);
            PFSecurityException $r7 = new PFSecurityException($r13, $r9);
            Timber.reorder($r7);
            C5325g $r10 = this.firebase;
            $r10.m25120d($r7);
            return null;
        } catch (BadPaddingException $r11) {
            String $r14 = $r11.getMessage();
            String $r15 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r14);
            PFSecurityUtilsErrorCodes $r82 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r82.getERROR_DEENCODING();
            Integer $r92 = Integer.valueOf($i02);
            PFSecurityException $r72 = new PFSecurityException($r15, $r92);
            Timber.reorder($r72);
            C5325g $r102 = this.firebase;
            $r102.m25120d($r72);
            return null;
        } catch (IllegalBlockSizeException $r122) {
            String $r16 = $r122.getMessage();
            String $r17 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r16);
            PFSecurityUtilsErrorCodes $r83 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i03 = $r83.getERROR_DEENCODING();
            Integer $r93 = Integer.valueOf($i03);
            PFSecurityException $r73 = new PFSecurityException($r17, $r93);
            Timber.reorder($r73);
            C5325g $r103 = this.firebase;
            $r103.m25120d($r73);
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public void deleteKey(String str) throws PFSecurityException {
        Log_OC.getArray(str, "alias");
        KeyStore $r2 = loadKeyStore();
        if ($r2 == null) {
            return;
        }
        try {
            $r2.deleteEntry(str);
        } catch (KeyStoreException $r3) {
            String $r1 = $r3.getMessage();
            String $r12 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r1);
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_DELETE_KEY();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r4 = new PFSecurityException($r12, $r6);
            Timber.reorder($r4);
            C5325g $r7 = this.firebase;
            $r7.m25120d($r4);
            PFSecurityUtilsErrorCodes $r52 = PFSecurityUtilsErrorCodes.INSTANCE;
            $r52.getERROR_DELETE_KEY();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public String encode(Context context, String str, String str2, boolean z) throws PFSecurityException {
        byte[] $r5;
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "alias");
        Log_OC.getArray(str2, MetricTracker.Object.INPUT);
        try {
            Cipher $r4 = getEncodeCipher(context, str, z);
            if ($r4 == null) {
                $r5 = null;
            } else {
                Charset $r6 = C13254d.f29413a;
                byte[] $r52 = str2.getBytes($r6);
                Log_OC.loadImage($r52, "(this as java.lang.String).getBytes(charset)");
                $r5 = $r4.doFinal($r52);
            }
            String $r2 = Base64.encodeToString($r5, 2);
            Log_OC.loadImage($r2, "encodeToString(bytes, Base64.NO_WRAP)");
            return $r2;
        } catch (BadPaddingException $r7) {
            $r7.printStackTrace();
            String $r22 = $r7.getMessage();
            String $r23 = Log_OC.m10359a("Error while encoding : ", (Object) $r22);
            PFSecurityUtilsErrorCodes $r9 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r9.getERROR_ENCODING();
            Integer $r10 = Integer.valueOf($i0);
            PFSecurityException $r8 = new PFSecurityException($r23, $r10);
            throw $r8;
        } catch (IllegalBlockSizeException $r11) {
            $r11.printStackTrace();
            String $r24 = $r11.getMessage();
            String $r25 = Log_OC.m10359a("Error while encoding : ", (Object) $r24);
            PFSecurityUtilsErrorCodes $r92 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r92.getERROR_ENCODING();
            Integer $r102 = Integer.valueOf($i02);
            PFSecurityException $r82 = new PFSecurityException($r25, $r102);
            throw $r82;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C5325g getFirebase() {
        C5325g r1 = this.firebase;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public boolean isKeystoreContainAlias(String str) throws PFSecurityException {
        Log_OC.getArray(str, "alias");
        KeyStore $r2 = loadKeyStore();
        if ($r2 == null) {
            return false;
        }
        try {
            boolean $z0 = $r2.containsAlias(str);
            return $z0;
        } catch (KeyStoreException $r3) {
            String $r1 = $r3.getMessage();
            String $r12 = Log_OC.m10359a("Can not initialize Encode Cipher:", (Object) $r1);
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_KEY_STORE();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r4 = new PFSecurityException($r12, $r6);
            Timber.reorder($r4);
            C5325g $r7 = this.firebase;
            $r7.m25120d($r4);
            return false;
        }
    }
}
