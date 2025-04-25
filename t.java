
        function createPetals() {
            const body = document.body;
            const numberOfPetals = 15;
            
            for (let i = 0; i < numberOfPetals; i++) {
                const petal = document.createElement('div');
                petal.classList.add('petal');
                
               
                const size = Math.random() * 15 + 5;
                petal.style.width = `${size}px`;
                petal.style.height = `${size}px`;
                
                
                petal.style.left = `${Math.random() * 100}vw`;
                
                // Random animation duration
                const duration = Math.random() * 10 + 5;
                petal.style.animationDuration = `${duration}s`;
                
               
                petal.style.animationDelay = `${Math.random() * 5}s`;
                
                body.appendChild(petal);
            }
        }

        
        document.addEventListener('DOMContentLoaded', function() {
            createPetals();
            
            const heart = document.getElementById('heart');
            const card = document.getElementById('card');
            const showMessageBtn = document.getElementById('showMessageBtn');
            const secretMessage = document.getElementById('secretMessage');
            
            heart.addEventListener('click', function() {
                heart.classList.toggle('open');
                
                if (heart.classList.contains('open')) {
                    setTimeout(() => {
                        card.classList.add('show');
                    }, 300);
                } else {
                    card.classList.remove('show');
                    secretMessage.style.display = 'none';
                }
            });
            
            showMessageBtn.addEventListener('click', function() {
                if (secretMessage.style.display === 'block') {
                    secretMessage.style.display = 'none';
                    showMessageBtn.textContent = 'Show Secret Message';
                } else {
                    secretMessage.style.display = 'block';
                    showMessageBtn.textContent = 'Hide Secret Message';
                }
            });
        });
    