# IntervaloNumericoParImpar


Comandos Utilizados

Aqui está a explicação resumida de cada comando para integrar diretórios locais com remoto no GitHub.

echo "# DiferencaIdade" >> README.md → Cria um arquivo README.md com o texto # DiferencaIdade (um título em Markdown).

git init → Inicializa um repositório Git na pasta atual (cria a estrutura oculta .git/).

git add README.md → Adiciona o arquivo README.md ao Staging Area (preparação para o commit).

git commit -m "first commit" → Cria um commit com as alterações adicionadas, usando a mensagem "first commit".

git branch -M main → Renomeia a branch padrão (geralmente master) para main (convenção moderna).

git remote add origin https://github.com/User/Diretório(repositório).git → Vincula o repositório local a um repositório remoto (GitHub) chamado origin.

git push -u origin main → Envia (push) os commits locais para o repositório remoto (origin), na branch main. → O -u define origin/main como upstream (rastreamento automático).

Resumo Geral: Esses comandos criam um novo projeto Git, adicionam um README.md, fazem o primeiro commit e o enviam para um repositório remoto no GitHub.

***************************************************************************************************************************

walter-domiciano:~/development/Exercicios/IntervaloNumericoParImpar(git:main)$ echo "# IntervaloNumericoParImpar" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Walterdev1k/IntervaloNumericoParImpar.git
git push -u origin main
Reinitialized existing Git repository in /home/walter-domiciano/development/Exercicios/IntervaloNumericoParImpar/.git/
[main d682b40] first commit
 1 file changed, 2 insertions(+), 1 deletion(-)
error: remote origin already exists.
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 315 bytes | 315.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Walterdev1k/IntervaloNumericoParImpar.git
   2fd6798..d682b40  main -> main
branch 'main' set up to track 'origin/main'.
