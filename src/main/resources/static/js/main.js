gsap.registerPlugin(ScrollTrigger);

// 히어로 애니메이션
gsap.timeline()
    .to('.hero-sub', { opacity: 1, y: 0, duration: 0.8, ease: 'power3.out' })
    .to('.hero-title', { opacity: 1, y: 0, duration: 1, ease: 'power3.out' }, '-=0.4')
    .to('.hero-desc', { opacity: 1, y: 0, duration: 0.8, ease: 'power3.out' }, '-=0.4');

// 섹션 타이틀 스크롤 애니메이션
gsap.utils.toArray('.section-title').forEach(title => {
    gsap.to(title, {
        opacity: 1,
        y: 0,
        duration: 1,
        ease: 'power3.out',
        scrollTrigger: {
            trigger: title,
            start: 'top 80%',
        }
    });
});

// 네비게이션 스크롤 효과
window.addEventListener('scroll', () => {
    const navbar = document.getElementById('navbar');
    if (window.scrollY > 50) {
        navbar.classList.add('scrolled');
    } else {
        navbar.classList.remove('scrolled');
    }
});

// API 데이터 로딩
async function loadWorks() {
    const res = await fetch('/api/category');
    const data = await res.json();
    const grid = document.getElementById('works-grid');
    data.forEach(item => {
        grid.innerHTML += `
            <div class="border border-zinc-800 p-8 hover:border-white transition duration-300 cursor-pointer">
                <p class="text-gray-500 text-sm mb-2">${item.id.toString().padStart(2, '0')}</p>
                <h3 class="text-2xl font-bold">${item.name}</h3>
            </div>
        `;
    });
}

async function loadCompany() {
    const res = await fetch('/api/company');
    const data = await res.json();
    const list = document.getElementById('company-list');
    data.forEach(item => {
        list.innerHTML += `
            <div class="border-b border-zinc-800 pb-8 flex justify-between items-start">
                <h3 class="text-3xl font-bold">${item.name}</h3>
                <p class="text-gray-500">${item.period}</p>
            </div>
        `;
    });
}

async function loadTools() {
    const res = await fetch('/api/techstack');
    const data = await res.json();
    const grid = document.getElementById('tools-grid');
    data.forEach(item => {
        grid.innerHTML += `
            <div class="border border-zinc-800 p-6 hover:border-white transition duration-300">
                <p class="text-gray-500 text-xs mb-2">${item.type}</p>
                <h3 class="text-xl font-bold">${item.name}</h3>
            </div>
        `;
    });
}

loadWorks();
loadCompany();
loadTools();