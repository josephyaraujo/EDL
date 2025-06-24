    //arvore simples
    //algoritmo O(n)
    public int height(No n){
        if (isExternal(n)){
            return 0;
        } else {
            int a = 0;
            for (No filho : n.getFilhos()){
                a = Math.max(a, this.height(filho));
            }
            return a + 1;
        }
    }

    //algoritmo O(n²)
    public int height (No n){
        a = 0;
        for (No no : this.nos()){
            if (isExternal(no)){
                a = Math.max(a, depth(no));
            }
            return a;
        }
    }