# Kozmetik Ürün ve Aktif İçerik Takip Sistemi

Kozmetik ürünlerin formülasyonlarını, içerdikleri aktif bileşenleri ve kullanım amaçlarını kataloglamak ve yönetmek amacıyla geliştirilmiş MVC tabanlı bir web uygulamasıdır.

## Proje Özellikleri
- Ürün ve İçerik Yönetimi: Kozmetik ürünlerin ve içerdikleri aktif maddelerin (Niacinamide, Azelaik Asit, Centella vb.) veritabanına kaydedilmesi ve ilişkisel olarak eşleştirilmesi
- CRUD İşlemleri: Ürün ve bileşen ekleme, güncelleme, listeleme ve silme operasyonları
- Dinamik Web Arayüzü: Thymeleaf şablon motoru ile backend verilerinin arayüze dinamik olarak yansıtılması
- Veri Kalıcılığı: Spring Data JPA ve Hibernate aracılığıyla nesne-ilişkisel eşleme (ORM) yönetimi

## Kullanılan Teknolojiler ve Mimari
- Programlama Dili: Java
- Framework: Spring Boot (Spring Web, Spring Data JPA)
- Şablon Motoru: Thymeleaf
- Mimari Yapı: Model-View-Controller (MVC)
- Veritabanı / ORM: Hibernate, H2 / MySQL

## Kurulum ve Çalıştırma
1. Repoyu bilgisayarınıza indirin:
   git clone https://github.com/KULLANICI_ADIN/Cosmetic-Ingredient-Tracker.git
2. Projeyi IntelliJ IDEA, Eclipse veya VS Code ile açın.
3. Maven bağımlılıklarının yüklenmesini bekleyin.
4. Application sınıfını (main metodu) çalıştırın.
5. Tarayıcınızdan localhost:8080 adresine gidin.

---
Geliştirici: Erdem Gül
